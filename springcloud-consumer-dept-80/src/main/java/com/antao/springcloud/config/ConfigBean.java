package com.antao.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author     ：antao
 * @date        2022/3/1 21:18
 * @description：
 * @modified By：
 */
@Configuration
public class ConfigBean {
//    @Configuration-----相当于spring中的applicationContext.XML

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}