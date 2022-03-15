package com.antao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author     ：antao
 * @date        2022/3/1 21:41
 * @description：
 * @modified By：
 */

//ribbon和eureka整合之后 可以直接调用服务名 不用关心ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}