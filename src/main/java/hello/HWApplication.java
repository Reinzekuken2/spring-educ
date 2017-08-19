package hello;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by User on 19.08.2017.
 */

@SpringBootApplication
public class HWApplication {

    public static void main(String[] args) {
//        SpringApplication springApplication = new SpringApplication();
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(HWApplication.class, args);
        SpringApplication.run(HWApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");
            System.out.println("Application started");
        };
    }


}
