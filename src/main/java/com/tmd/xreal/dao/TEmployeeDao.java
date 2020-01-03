package com.tmd.xreal.dao;

import com.tmd.xreal.pojo.TEmployee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author zxw
 * @date 2019-12-27 16:57
 */
public interface TEmployeeDao extends JpaRepository<TEmployee,Long> {


    //通过名称去查询
    public List<TEmployee> findByName(String name);

    public  List<TEmployee> findByNameContaining(String name);


    //分页


    //修改
    @Modifying
    @Query("update TEmployee set name = ?1 where id=?2")
    public void updateNameById(String name ,long id);


    //计数
    @Query("select count(distinct id) from TEmployee ")
    public long conutForTotal();



    //记住建表语句是区分大小写的,就是大小写敏感,这个是基于建表语句ut
    @Query(value = "select * from t_emloyee ",countQuery = "select count (*) from t_emloyee ",nativeQuery = true)
    public Page<TEmployee> findByNativeSql(Pageable pageable);




}
