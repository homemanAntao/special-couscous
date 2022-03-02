package com.antao.springcloud.service;

import com.antao.springcloud.dao.DeptDao;
import com.antao.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author     ：antao
 * @date        2022/2/28 22:56
 * @description： 部门实现接口
 * @modified By：安桃
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> listAllDepts() {
        return deptDao.listAllDepts();
    }
}