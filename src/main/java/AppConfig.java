import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean
    @Scope(value = "prototype")
    public Cat getNewCat() {
        Cat cat = new Cat();
        cat.setMessage("It's Purrfect World!");
        return cat;
    }

}