package com.tmd.xreal.dao;

import com.tmd.xreal.pojo.TEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zxw
 * @date 2019-12-27 16:57
 */
public interface TEmployeeDao extends JpaRepository<TEmployee,Long> {


    //通过名称去查询
    public List<TEmployee> findByName(String name);

    public  List<TEmployee> findByNameContaining(String name);

}
