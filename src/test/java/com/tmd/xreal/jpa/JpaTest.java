package com.tmd.xreal.jpa;

import com.tmd.xreal.dao.TEmployeeDao;
import com.tmd.xreal.pojo.TEmployee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zxw
 * @date 2019-12-27 16:59
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JpaTest {

    @Autowired
   private TEmployeeDao tEmployeeDao;

    //完全匹配
    @Test
    public  void queryByName(){
        List<TEmployee> list = tEmployeeDao.findByName("猪八戒");
        System.out.println(list);
    }


    //模糊查询
    @Test
    public  void queryByLikeName(){
        List<TEmployee> list = tEmployeeDao.findByNameContaining("猪");
        System.out.println(list);
    }
}
