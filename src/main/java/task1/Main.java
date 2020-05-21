package task1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args ) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Product battery = ctx.getBean("battery", Product.class);
        Product disc = ctx.getBean("disc", Product.class);
        System.out.println(battery);
        System.out.println(disc);
    }
}



