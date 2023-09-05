package com.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Generic01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("中华田园犬",1));
        arrayList.add(new Dog("阿拉斯加",2));
        //在这里加入一个猫类,后面的向下转型就会报错,因为添加的是猫类,转错了
        arrayList.add(new Cat("布偶",2));
        for (Object o : arrayList
             ) {
            //存在的问题：
            //1、添加的数据类型没有限制
            //2、向下转型  效率低
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}