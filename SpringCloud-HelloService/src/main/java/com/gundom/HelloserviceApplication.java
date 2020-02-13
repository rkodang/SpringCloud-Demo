package com.gundom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.gundom"})
public class HelloserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloserviceApplication.class, args);
    }

}
