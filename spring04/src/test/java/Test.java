
import com.ioc.controller.UserController;
import com.ioc.servict.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserController bean = classPathXmlApplicationContext.getBean(UserController.class);
        System.out.println(bean.controller(4,2));
    }
}
