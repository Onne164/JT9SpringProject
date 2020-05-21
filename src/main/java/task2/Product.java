package task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {

    private Delivery delivery;

    // Constructor based DI
    @Autowired
    public Product(Delivery delivery) {
        this.delivery = delivery;
    }

    public void doSomething() {
        delivery.doSomething();

    }
}
