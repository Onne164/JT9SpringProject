package task3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task3.config.AppConfig;
import task3.config.ConfigA;
import task3.config.ConfigB;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ServiceA serviceA = ctx.getBean(ServiceA.class);
        serviceA.printMsg("Hello B!");

        ServiceB serviceB = ctx.getBean(ServiceB.class);
        serviceB.printMsg("Hello A!");
        }
}
