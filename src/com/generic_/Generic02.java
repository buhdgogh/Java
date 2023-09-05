package com.generic_;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        //注:
        //使用泛型,解决运行时错误
        //在对泛型传入参数类型的时候,这个类中所有含有<E>的,也就是含有泛型的方法...,都会替换为指定的类型
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("中华田园犬",1));
        dogs.add(new Dog("阿拉斯加",2));
        //因为上面指定了添加的元素的类型为Dog,所以这里添加会报错
        //dogs.add(new Cat("布偶",2));
        System.out.println("====使用泛型====");
        for (Dog o : dogs //因为上面指定了添加的类型为Dog,所以这里可以直接用Dog类接收
        ) {
            System.out.println(o.getName() + "-" + o.getAge());
        }
    }
}

