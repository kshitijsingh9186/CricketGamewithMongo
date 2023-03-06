package com.example.cricketgame.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CricketGameApplication {

    public static void main(String[] args) {

        SpringApplication.run(CricketGameApplication.class, args);
    }


}
