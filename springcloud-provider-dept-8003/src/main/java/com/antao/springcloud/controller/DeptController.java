package com.antao.springcloud.controller;

import com.antao.springcloud.pojo.Dept;
import com.antao.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author     ：antao
 * @date        2022/2/28 22:59
 * @description：提供restful服务
 * @modified By：安桃
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

    @PostMapping("dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id) {
        return deptService.queryById(id);
    }

    @GetMapping("dept/listAll")
    public List<Dept> queryAll() {
        return deptService.listAllDepts();
    }

    @GetMapping("dept/getAllService")
    public List<ServiceInstance> getService() {
        return client.getInstances("SPRINGCLOUD-PROVIDER-DEPT-8001");
    }
}