package com.singleinstance_;

//单例设计模式(懒汉式)：
//由于单例设计模式的对象通常是重量级的 假如创建了没有用就会导致资源的浪费
//因此引入懒汉式的单例设计模式
// 特点：类加载的时候并没有真正的创建对象 只有调用该类的方法的时候才会创建对象
//       当第二次及以后调用该类的方法的时候就直接返回之前创建的对象
//       只有用户调用getInstance()方法蔡虎创建或者返回对象
// 总结：
// 1、构造器私有化 防止用户直接new
// 2、在类内部实例化一个对象
// 3、提供一个公有的静态的方法来获取这个对象
public class SingleInstance02 {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        System.out.println(cat.toString());
        Cat cat1 = Cat.getInstance();
        System.out.println(cat1.toString());
        /*
        运行结果：
        构造器被调用
        Cat{name='小白'}
        Cat{name='小白'}
        */

        /*
        分析：
        构造器只会调用一次 那是因为最开始并未给cat分配存储空间
        当第一次调用的时候就会为cat分配空间 然后需要调用构造器
        但当第二次调用的时候就会判断cat不为null
        然后就会返回第一次创建的对象 不会再调用构造器
        */
    }
}

class Cat {
    private String name;
    public static int n1;
    //创建一个变量 但是不给它分配存储空间
    private static Cat cat;

    public Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    //当第一次调用这个方法的时候就为创建的对象分配存储空间
    //第二次及以后的调用就返回这个对象
    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("小白");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
