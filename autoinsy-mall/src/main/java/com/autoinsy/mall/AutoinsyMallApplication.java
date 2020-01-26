package com.autoinsy.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class AutoinsyMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoinsyMallApplication.class, args);
    }

}
