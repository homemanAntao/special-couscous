package com.antao.springcloud.controller;

import com.antao.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

/**
 * @author ：antao
 * @date 2022/3/1 21:12
 * @description：服务调用者
 * @modified By：
 */
@RestController
public class DeptConsumerController {

    public static final String REST_URL_PREFIX = "http://localhost:8001";
    //消费端不应该有service层
    //restTemplate restful请求模板重要的参数（url，Map---请求实体， Class<T> responseType---响应方式）
    @Autowired
    private RestTemplate restTemplate;//提供便捷访问http服务的方法，简单的restful服务模板

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/"+id, Dept.class);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List listDepts() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/listAll", List.class);
    }

}