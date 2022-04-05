package pl.pjatk.krzszy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("dev")
@ConditionalOnProperty(
        value="module.enabled",
        havingValue = "true",
        matchIfMissing = true)
public class JazPojoConfiguration {
    @Bean
    public JazPojoConfiguration jazPojoConfiguration(@Value("${my.custom.property:defaultValue}") String propertiesValue, @Value("${my.false.bool}") Boolean isOn) {
        System.out.println(propertiesValue);
        if (isOn) {
            System.out.println("działa");
        }
        return new JazPojoConfiguration();
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
