import com.ctra.mapper.UserMapper;
import com.ctra.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    public static void main(String[] args) throws IOException {
         ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        for (User user : userMapper.getUserList()) {
            System.out.println(user);

        }
    }

    void test() throws IOException {
//        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml"); //进行了整合，换成总的beans
        InputStream resourceAsStream = Resources.getResourceAsStream("applicationContext.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession session = build.openSession(true);

        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        session.close();

    }
}
