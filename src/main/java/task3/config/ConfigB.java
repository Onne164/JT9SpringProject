package task3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task3.ServiceB;

@Configuration
public class ConfigB {

    @Bean(name="serviceB")
    public ServiceB serviceB() {
        return new ServiceB();

    }
}
