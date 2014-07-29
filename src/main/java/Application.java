import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        ConfigurableEnvironment environment = context.getEnvironment();


        Map<String, Object> sysProperties = context.getEnvironment().getSystemProperties();
        for (String key : sysProperties.keySet()) {
            Object value = sysProperties.get(key);

//            System.out.print(key + " : ");
//            System.out.println(value);
        }
    }

}
