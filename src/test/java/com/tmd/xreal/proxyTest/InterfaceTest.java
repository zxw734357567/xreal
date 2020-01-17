package com.tmd.xreal.proxyTest;

/**
 * @author zxw
 * @date 2020-01-15 14:10
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InterfaceTest {
    @Autowired
    @Qualifier("user1")
    private User user;

    @Test
    public void get(){
        String eat = user.eat("123");
        System.out.println(eat);
    }


}



interface User{
   String eat(String food);

}
@Component("user")
class UserImpl implements User{

    @Override
    public String eat(String food) {
        return"123";
    }
}
@Component("user1")
class UserImple1 implements User{
    @Override
    public String eat(String food) {
        return"456";
    }
}