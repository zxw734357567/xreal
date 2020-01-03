package com.tmd.xreal.jpa;

import com.tmd.xreal.dao.TEmployeeDao;
import com.tmd.xreal.pojo.TEmployee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
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

    //新建保存
    //@Test
    public void save(){
        TEmployee tEmployee = new TEmployee();
        tEmployee.setId(2l);
        tEmployee.setAddress("水帘洞");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse("1650-09-09 23:59:59", dateTimeFormatter);
        long l1 = parse.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        tEmployee.setBirthday(new Date(l1));
        tEmployee.setName("孙悟空");
        tEmployee.setSalary(10800.00d);
        TEmployee save = tEmployeeDao.save(tEmployee);
        System.out.println(save);
    }


    @Test
    @Transactional
   // @Rollback(false)   开启事务,事务管理器帮我回滚,而且调用的时候必须加上@Transactional,不然会报错
    public void update(){
        tEmployeeDao.updateNameById("六小龄童",2l);
    }


    //计算总数
    @Test
    public void count(){
        long count = tEmployeeDao.conutForTotal();
        System.out.println(count);
    }

    //分页
    @Test
    public  void pageHelper(){

      //  Sort id = new Sort(Sort.Direction.DESC, "id");
       // Pageable pageable = new PageRequest(1,4);
        Page<TEmployee> all = tEmployeeDao.findAll(PageRequest.of(0,5));
        System.out.println(all);
    }


    //
    @Test
    public void queryPageByNativeSql(){
        Page<TEmployee> byNativeSql = tEmployeeDao.findByNativeSql(PageRequest.of(0, 5, Sort.Direction.DESC,"id"));
        System.out.println(byNativeSql);
    }
}
