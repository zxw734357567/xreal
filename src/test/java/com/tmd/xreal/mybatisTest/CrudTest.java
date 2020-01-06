package com.tmd.xreal.mybatisTest;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tmd.xreal.dto.TEmployContainOrder;
import com.tmd.xreal.entities.TEmloyee;
import com.tmd.xreal.entities.TOrder;
import com.tmd.xreal.mapper.TEmloyeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author zxw
 * @date 2020-01-02 16:39
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CrudTest {

    @Autowired
    private TEmloyeeDao tEmloyeeDao;

    @Test
    public void select(){
        TEmloyee tEmloyee = tEmloyeeDao.selectByPrimaryKey(1);
        System.out.println(tEmloyee);
    }


    //分页
    @Test
    public  void selectPage(){
        Page<TEmloyeeDao> objects = PageHelper.startPage(1, 10);
        List<TEmloyee> tEmloyees = tEmloyeeDao.selectAll();
        PageInfo<TEmloyee> tEmloyeePageInfo = new PageInfo<>(tEmloyees);
        System.out.println(tEmloyeePageInfo.toString());
    }


    @Test
    public void selectAll(){
        List<TEmloyee> tEmloyees = tEmloyeeDao.selectAll();
       tEmloyees.forEach((tEmloyee)-> System.out.println(tEmloyee.toString()));
    }


    //这个是使用注解sql完成的测试
    @Test
    public void selectById(){
        TEmloyee tEmloyee = tEmloyeeDao.selectById(1);
        System.out.println(tEmloyee);
    }

    //我修改了useGenerator，然后修改了sql
    @Test
    public void save(){
        TEmloyee tEmloyee = new TEmloyee();
        tEmloyee.setName("白骨精");
        tEmloyee.setAddress("盘丝洞");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate parse = LocalDate.parse("1460-08-12 23:29:09", dateTimeFormatter);
        tEmloyee.setBirthday(parse);
        tEmloyee.setSalary(3000d);
        tEmloyee.setId(3);
        int insert = tEmloyeeDao.insert(tEmloyee);
        System.out.println(insert);
    }


    //关联查询

    @Test
    public void selectTemployAndOrders(){
        List<TEmployContainOrder> tEmployContainOrders = tEmloyeeDao.selectTemployAndOrders();
        tEmployContainOrders.forEach((item)-> {
            System.out.println(item.toString());
            List<TOrder> tOrders = item.gettOrders();
            tOrders.forEach((i)-> System.out.println(i));
        });
    }

    @Test
    public void selectByLike(){
        List<TEmloyee> lists = tEmloyeeDao.selectByLikeName("猪八");
        lists.forEach((item)-> System.out.println(item.toString()));
    }

    @Test
    public void selectByTime(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<TEmloyee> list = tEmloyeeDao.selectByTime("猪八戒", LocalDate.parse("1300-01-01",dateTimeFormatter),
                LocalDate.parse("2000-01-01", dateTimeFormatter));
        list.forEach(item-> System.out.println(item.toString()));
    }

}
