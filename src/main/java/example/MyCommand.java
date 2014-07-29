package example;

import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;


@Component
public class MyCommand implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(MyCommand.class.getName());

    @Autowired
    private Environment env;

    @Override
    public void run(String... args) throws Exception {
        String message = String.format("Env: [%s], Secret: [%s] Number: [%s]",
                env.getProperty("env"), env.getProperty("my.secret"), env.getProperty("my.number"));
        log.info(message);

        System.out.println("Wheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee! ");
    }

}
