package com.tmd.xreal;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class XrealApplicationTests {

    @BeforeClass
    public  static   void setUpClas()throws Exception{
        System.out.println("this is  BeforeClass");
    }

    //=============准备
    @Before
    public void setUp() throws Exception{
        System.out.println("哈哈哈");
    }

    @Test
    public void get(){
        gt(null,1);
    }

    public void gt(Integer a,int b){
        System.out.println(a);
        System.out.println(b);
    }







    @Test
   public void contextLoads() throws Exception{
        System.out.println("正式测试");
    }

    //=============销毁
    @After
    public void tearUp()throws Exception{
        System.out.println("this is after");
    }

    @AfterClass
    public  static void tearUpStatic()throws Exception{
        System.out.println("this is AfterClass");
    }
}
