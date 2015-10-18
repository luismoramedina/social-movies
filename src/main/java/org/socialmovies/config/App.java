package org.socialmovies.config;

import org.socialmovies.films.web.FilmsRestTemplate;
import org.socialmovies.users.web.UsersRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

/**
 * @author luis mora
 */
@SpringBootApplication
@Import({UsersRestController.class, FilmsRestTemplate.class/*, WebMvc.class*/})
public class App {
    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(App.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println("#####################" + beanName);
        }

    }
}