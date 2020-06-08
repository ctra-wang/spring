import com.ctra.dao.UserDaoImpl;
import com.ctra.dao.UserDaoMysqlImpl;
import com.ctra.dao.UserDaoOracleImpl;
import com.ctra.service.UserService;
import com.ctra.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        // 获取 ApplicationContext ： 拿到Spring的容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }

    void test() {
        // 实际调用业务层
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoOracleImpl());
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.setUserDao(new UserDaoImpl());


        userService.getUser();
    }
}
