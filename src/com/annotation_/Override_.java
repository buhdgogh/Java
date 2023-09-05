package com.annotation_;

public class Override_ {
    public static void main(String[] args) {

    }
}

class Father {
    void fly() {
        System.out.println("Father中的fly方法...");
    }
}


class Son extends Father {
    // 1.这里的@override写在子类的fly的方法上  表示这个方法是重写的父类方法
    // 2.如果这里没有@override 这里仍是重写父类的fly方法
    // 3.如果这里写了@override 编译器就会去检查这个是否真的重写了父类的方法
    //   如果重写了 则编译器通过  如果没有重写那么编译器就会报错
    // 4.看卡override的实现：
    // @interface 不是表示这是个接口  而是表示这是一个注解类
    /*
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
     }
     */
    @Override
    void fly() {
        System.out.println("Son中的fly方法...");
    }

//    @Override
//    void say() {
//
//    }
}