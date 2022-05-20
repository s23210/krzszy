package pl.pjatk.krzszy.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.pjatk.krzszy.domain.JazPojo;

import java.util.List;

@Configuration
@ConditionalOnProperty(
        name = "module.enabled",
        havingValue = "true",
        matchIfMissing = true)
public class JazPojoConfiguration {
    @Bean
    public String aleJazz(@Value("${my.custom.property:defaultValue}") String propertiesValue, @Value("${my.false.bool}") Boolean isOn) {
        System.out.println(propertiesValue);
        if (isOn) {
            System.out.println("działa");
        }
        return "abc";
    }
    @Bean
    public JazPojo jazPojo() {
        return new JazPojo();
    }

    @Bean
    public List<String> defaultData() {
        return List.of("string1", "string2", "string3", "string4", "string5");
    }
}
