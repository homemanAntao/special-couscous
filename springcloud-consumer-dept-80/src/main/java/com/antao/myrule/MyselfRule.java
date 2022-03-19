package com.antao.myrule;


import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule() {
//        return new RandomRule();
        //这里是自定义的随机算法
        return new AntaoRandomRule();
    }
}
