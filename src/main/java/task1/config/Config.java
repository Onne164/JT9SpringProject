package task1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task1.Battery;
import task1.Disc;
import task1.Product;


@Configuration
public class Config {

    @Bean
    public Product battery() {
        Battery theBattery = new Battery();
        theBattery.setProductName("Duracell");
        theBattery.setPrice(0.80);
        theBattery.setQuantity(600);
        theBattery.setRechargeable(false);
        return theBattery;
    }

    @Bean
    public Product disc() {
        Disc theDisc = new Disc();
        theDisc.setProductName("Verbatim DVD-R 4.7GB");
        theDisc.setPrice(12.80);
        theDisc.setQuantity(400);
        theDisc.setCapacity(800);
        return theDisc;
    }
}
