package pl.pjatk.krzszy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

public class Class3 {
    public Class3(ApplicationContext applicationContext) {
        Class1 class1 = applicationContext.getBean("class1", Class1.class);
        Class2 class2 = applicationContext.getBean("class2", Class2.class);
        class1.printHello();
        class2.printHello();
    }
}
