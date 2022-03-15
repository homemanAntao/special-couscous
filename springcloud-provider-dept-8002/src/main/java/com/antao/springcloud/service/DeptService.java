package com.antao.springcloud.service;

import com.antao.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author ：antao
 * @date 2022/2/28 22:55
 * @description：
 * @modified By：
 */
public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> listAllDepts();
}
