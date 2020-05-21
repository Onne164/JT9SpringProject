package task4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task1.Product;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Product battery = (Product)ctx.getBean("battery");
        Product disc = (Product)ctx.getBean("disc");

        ShoppingCart customer1 = (ShoppingCart)ctx.getBean("shoppingCart");
        customer1.addItem(battery);
        customer1.addItem(disc);
        System.out.println("The first customer's shopping cart: " + customer1.getItems());

        ShoppingCart customer2 = (ShoppingCart)ctx.getBean("shoppingCart");
        customer2.addItem(battery);
        System.out.println("The second customer's shopping cart: " + customer2.getItems());
    }
}
