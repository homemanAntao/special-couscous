package com.antao.springcloud.controller;

import com.antao.springcloud.pojo.Dept;
import com.antao.springcloud.service.DeptClientSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：antao
 * @date 2022/3/1 21:12
 * @description：服务调用者
 * @modified By：
 */
@RestController
public class DeptConsumerController {

    @Autowired
    DeptClientSevice deptClientSevice;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable Long id) {
        return this.deptClientSevice.queryById(id);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept) {
        return this.deptClientSevice.addDept(dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept>  listDepts() {
        return this.deptClientSevice.listAllDepts();
    }

}