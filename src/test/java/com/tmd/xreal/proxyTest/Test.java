package com.tmd.xreal.proxyTest;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zxw
 * @date 2020-01-15 11:43
 */
public class Test {
    public static void main(String[] args) {

        Person person = new Person();
        person.go();
        person.have();

        System.out.println("===========================");

        Work proxyperson= (Work) Proxy.newProxyInstance(Work.class.getClassLoader(),new Class[]{Work.class},new PersonPorxy());

        proxyperson.go();
        proxyperson.have();

    }
}

class PersonPorxy implements InvocationHandler {
    Person person=new Person();
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        //1.获取方法名
//        String methodName = method.getName();
//        //2.获取方法所在的类的名称
//        String className = method.getDeclaringClass().getName();
//        //3.组合key
//        String key=className+"."+methodName;
        //4.diao
        System.out.println("                                    ");

        System.out.println("方法名字:"+method.getName()+";\n"+"class全限定类名："+method.getDeclaringClass().getName());

        Object obj=null;

        //从这你应该可以知道
        //可以通过method.getName获取的方法名的不同
        //来有针对性的来强化代理方法，
        if (method.getName()=="go"){
            System.out.println("这是高级的人");
            //调用其他实现的方法，的方法
            obj= method.invoke(person, args);
            System.out.println("开车上班");

            return obj ;
        }
        //返回的method.invoke就是 test类里的method方法 go（） 和have（）
        obj = method.invoke(person, args);
        System.out.println("                                    ");
        return obj;

    }
}
class Person implements Work{

    @Override
    public void go() {
        System.out.println("走路上班");
    }

    @Override
    public void have() {
        System.out.println("吃米饭");
    }
}

interface Work {
    public void go();
    public void have();
}