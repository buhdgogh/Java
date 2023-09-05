package com.innerclass_;

//内部类：
//概念：一个类内部完整的嵌套另一个类，被嵌套的这个类叫做内部类(inner class)
//      外面嵌套的那个类叫做外部类(outer class)
public class InnerClass01 {
    public static void main(String[] args) {

    }
}

class Outer { //外部类
    private int n1 = 100; //属性

    public Outer(int n1) { //构造器
        this.n1 = n1;
    }

    public void say() { //方法
        System.out.println("Hello, world!");
    }

    class Inner { //内部类

    }

}
