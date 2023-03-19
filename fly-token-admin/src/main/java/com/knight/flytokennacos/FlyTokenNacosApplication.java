package com.knight.flytokennacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * 服务注册配置中心
 * </p>
 *
 * @author knight-jzc 2023/03/16 18:41
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FlyTokenNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyTokenNacosApplication.class, args);
    }

}
