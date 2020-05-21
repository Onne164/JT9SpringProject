package task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task2.config.Config;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Delivery delivery = ctx.getBean(Delivery.class);
        delivery.doSomething();

        ctx.close();
    }
}
