package com.antao.springcloud.dao;

import com.antao.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author     ：antao
 * @date        2022/2/28 22:43
 * @description：
 * @modified By：
 */
@Mapper
@Repository
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept queryById(long id);

    List<Dept> listAllDepts();
}