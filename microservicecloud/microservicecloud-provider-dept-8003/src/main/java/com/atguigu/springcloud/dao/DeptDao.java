package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description: 部门Dao
 * @author: yangjiang
 * @create: 2020-07-01 17:56
 **/


@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(long id);

    public List<Dept> findAll();
}
