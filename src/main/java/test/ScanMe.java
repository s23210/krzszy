package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScanMe {
    @Bean
    public String test() {
        System.out.println("AAAAAA");
        return "test";
    }
}
