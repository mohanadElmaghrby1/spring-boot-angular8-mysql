package com.mohannad.springmysql;

import com.mohannad.springmysql.model.User;
import com.mohannad.springmysql.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringMysqlApplication {



    public static void main(String[] args) {
        SpringApplication.run(SpringMysqlApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserService userService) {
        return args -> {
            userService.save(new User("mohannad" , 20));
            userService.save(new User("Omar" , 30));
            userService.save(new User("samy" , 22));
            userService.save(new User("fady" , 50));
        };
    }

}
