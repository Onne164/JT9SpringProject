package task3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task3.ServiceA;

@Configuration
public class ConfigA {

    @Bean(name="serviceA")
    public ServiceA serviceA() {
        return new ServiceA();

    }
}
