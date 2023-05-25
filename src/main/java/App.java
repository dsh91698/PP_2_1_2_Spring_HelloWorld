import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        // second helloword
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        //compare helloword beans
        System.out.println(bean == bean2);
        //cat beans
        Cat catOne = applicationContext.getBean(Cat.class);
        Cat catTwo = applicationContext.getBean(Cat.class);
        //compare cats
        System.out.println(catOne == catTwo);

    }
}