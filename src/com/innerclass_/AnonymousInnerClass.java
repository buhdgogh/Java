package com.innerclass_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        // 基于接口的匿名内部类
        Test test = new Test();
        test.m2();

    }
}

class Test {
    private int n = 100;
    public void m1(){
        System.out.println("Test的m1()方法");
    }

    public void m2() {
        System.out.println("Test的m2()方法");
        //匿名内部类：
        //编译类型：IA_
        //运行类型：匿名内部类-->系统自动分配(Test$1)
        /*
        底层：
        class Test$1 implements IA_ {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        }
         */
        // jdk底层在创建匿名内部类会立即创建一个对象 Test$1 实例，并把地址返回给tiger
        // 匿名内部类使用一次就不能再使用 但是将匿名内部类创建的对象地址返回给一个变量  这个变量就可以用多次
        // 接口是不能new的 但是加了{}后   jdk就知道这个语法 他会在底层创建一个匿名内部类
        IA_ tiger = new IA_() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        tiger.cry();
        System.out.println(tiger.getClass());//得到tiger的运行类型


        // 基于类的匿名内部类
        // 编译类型：Father
        // 运行类型：Test$2
        /*
        底层：
        这里继承后Test$2是一个新的类
        class Test$2 extends Father {

        }
         */
        // 同时也返回了匿名内部类Test$2的对象
        Father father = new Father("smith"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型：" + father.getClass());
        father.test();
    }
}

//class Tiger implements IA_ {
//
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤...");
//    }
//}

interface IA_ {
    void cry();
}


class Father {
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public void test() {

    }
}
