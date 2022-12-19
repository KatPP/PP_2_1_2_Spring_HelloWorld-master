import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println(bean==bean2);

        Cat beancat = (Cat) applicationContext.getBean("cat");
        System.out.println(beancat.getMessage());

        Cat beancat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beancat2.getMessage());

        System.out.println(beancat==beancat2);
    }
}