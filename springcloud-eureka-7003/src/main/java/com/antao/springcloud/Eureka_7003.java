package com.antao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author     ：antao
 * @date        2022/3/1 23:16
 * @description：eureka的服务启动类
 * @modified By：
 */
//启动之后访问地址+7003
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer 表示可以让别人注册进来
public class Eureka_7003 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7003.class,args);
    }
}