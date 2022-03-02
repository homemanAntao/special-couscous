package com.antao.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author     ：antao
 * @date        2022/2/28 21:24
 * @description：
 * @modified By：
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)//链式注解
public class Dept implements Serializable {
    //id
    private long deptNo;
    //名称
    private String dname;

    //对应哪一个数据库，一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    /**
     * 链式写法
     Dept dept = new Dept();
     dept.setName("aa").setDb_source("db01")
     */
}