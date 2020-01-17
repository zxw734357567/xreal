package com.tmd.xreal.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zxw
 * @date 2020-01-06 14:13
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void set(){
        redisTemplate.opsForValue().set("zhubajie", "23");
    }

    @Test
    public void get(){
        String zhubajie = (String)redisTemplate.opsForValue().get("zhubajie");
        System.out.println(zhubajie);
    }


}
