package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 付恒
 * @ClassName PaymentMain9001
 * @Date 2020/10/5
 * @Version 1.0
 **/

@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9011 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9011.class,args);
    }
}
