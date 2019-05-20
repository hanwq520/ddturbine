package com.hanwq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

/**
 * Description: ddturbine
 * Created by hanwq on 2019/5/20 15:21
 */
@Configuration
@EnableAutoConfiguration
@EnableTurbine
@EnableDiscoveryClient
public class TurbineApplication {
    //http://localhost:8989/turbine.stream
    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }

}
