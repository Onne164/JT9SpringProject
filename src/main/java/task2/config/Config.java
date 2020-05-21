package task2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import task2.Delivery;
import task2.ExpressDelivery;
import task2.RegularDelivery;

@Configuration
@ComponentScan(basePackages = "task2")
public class Config {

    @Bean
    public Delivery getExpressDelivery() {
        return new ExpressDelivery();
    }

    @Bean
    @Primary
    public Delivery getRegularDelivery() {
        return new RegularDelivery();
    }
}
