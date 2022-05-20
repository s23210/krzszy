package pl.pjatk.krzszy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
//@ComponentScan(basePackages = "test")
public class KrzszyApplication {

    public static void main(String[] args) {
        SpringApplication.run(KrzszyApplication.class, args);
    }

}
