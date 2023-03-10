package org.ice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Cloud_provider_payment8002 {
    public static void main(String[] args) {
        SpringApplication.run(Cloud_provider_payment8002.class, args);
    }
}