package com.tmd.xreal.systemProperties;

import java.util.Properties;

/**
 * @author zxw
 * @date 2020-01-17 10:41
 */
public class Test {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.setProperty("spring.security.strategy","aaa.bbb.ccc");
        properties.forEach((a,b)-> System.out.println(a.toString()+"==="+b.toString()));
    }
}
