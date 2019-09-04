package com.barista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
public class NetctossApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetctossApplication.class, args);
    }


}
