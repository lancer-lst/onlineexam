package com.lst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringService {
    public static void main(String[] args) {
        SpringApplication.run(SpringService.class,args);
    }
}
