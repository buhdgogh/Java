package com.singleinstance_;

import jdk.nashorn.internal.ir.CallNode;

//单例设计模式(饿汉式)
// 特点：还没有用到这个类的对象 在类加载的时候就已经创建好了
// 总结：在类加载的时候就创建了 如果不用就会导致资源浪费
// 1、构造器私有化 防止用户直接new
// 2、在类内部实例化一个对象
// 3、提供一个公有的静态的方法来获取这个对象
public class SingleInstance01 {
    public static void main(String[] args) {
        System.out.println(GirlFriend.n1);
        GirlFriend xx = GirlFriend.getInstance();
        System.out.println(xx.toString());
        GirlFriend tt = GirlFriend.getInstance();
        System.out.println(tt.toString());
        System.out.println(xx.equals(tt));
    }
}

// 单例设计模式的方法：
// 1、构造器私有化 防止用户直接new
// 2、在类内部实例化一个对象
// 3、提供一个公有的静态的方法来获取这个对象
// 保证只有一个实例化对象GirlFriend
// 为什么要提供一个static方法？
// 因为如果不是static方法那么要使用这个方法就要实例化一个对象,
// 但是由于构造器私有化了就不能实例化一个对象
// 因此这个方法必须为static方法(不需要实例化创建对象)
// 因此这个对象也要设置为static访问  否则无法被访问
// 只能有一个女朋友
class GirlFriend {
    private String name;
    public static int n1 = 888;
    //为了能够在静态方法中,返回这个对象,需要将这个对象修饰为static
    //只要类被加载 这个对象就创建了
    private static GirlFriend xx = new GirlFriend("小肖");

    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return xx;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
