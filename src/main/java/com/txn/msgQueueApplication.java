package com.txn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class msgQueueApplication {

    public static void main(String[] args){
        SpringApplication.run(msgQueueApplication.class,args);
    }
}
