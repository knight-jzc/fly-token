package com.knight.flytokengateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * 路由中心
 * </p>
 *
 * @author knight-jzc 2023/03/16 18:40
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FlyTokenGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyTokenGatewayApplication.class, args);
    }

}
