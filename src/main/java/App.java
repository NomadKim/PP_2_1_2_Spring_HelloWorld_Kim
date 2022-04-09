import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                 applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld secondbean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean == secondbean);

        Cat firstCat = applicationContext.getBean("cat", Cat.class);
        Cat secondCat = applicationContext.getBean("cat", Cat.class);

        System.out.println(firstCat == secondCat);

    }
}