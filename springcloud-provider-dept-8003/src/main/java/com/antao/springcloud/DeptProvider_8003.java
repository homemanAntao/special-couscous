package com.antao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author     ：antao
 * @date        2022/2/28 23:06
 * @description： 该服务的启动类
 * @modified By：
 */
//启动类
@SpringBootApplication
@EnableEurekaClient //服务启动的时候将该服务注册到eureka中
public class DeptProvider_8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8003.class, args);
    }
}