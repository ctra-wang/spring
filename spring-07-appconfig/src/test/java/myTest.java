import com.ctra.config.MyConfig;

import com.ctra.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myTest {

    public static void main(String[] args) {
        // 通过纯注解的方式获得上下文
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
        System.out.println(getUser.toString());

    }
}
