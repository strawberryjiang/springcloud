package com.atguigu.springcloud.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @description: 部门表
 * @author: yangjiang
 * @create: 2020-07-01 17:07
 **/

@SuppressWarnings("serial")
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = 5952689219411916553L;

    private long deptno;
    private String dname;
    private String db_source;



}
