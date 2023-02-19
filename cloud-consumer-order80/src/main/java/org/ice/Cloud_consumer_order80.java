package org.ice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Cloud_consumer_order80 {
    public static void main(String[] args) {
        SpringApplication.run(Cloud_consumer_order80.class,args);
    }

}