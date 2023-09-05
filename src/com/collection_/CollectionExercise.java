package com.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("中华田园",3));
        list.add(new Dog("柯基",2));

        Iterator iterator = list.iterator();
        System.out.println("while迭代器===");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next=" + next);
        }
        System.out.println("增强for循环===");
        for (Object dog :list) {
            System.out.println("dog=" + dog);
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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
