package com.collection_.set_.hashsetexercise_;

import com.abstract_.abstractexercise_.Employee;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExercise01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee01("zhangsan",18));
        hashSet.add(new Employee01("lisi",19));
        hashSet.add(new Employee01("wangermazi",88));
        hashSet.add(new Employee01("zhangsan",18));
        System.out.println(hashSet);
    }
}

class Employee01 {
    private String name;
    private int age;

    public Employee01(String name, int age) {
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

    //问题分析：
    // 由于要求名字和年龄相同就不能加进去，那么我们需要在生成hash值的时候，
    // 让相同名字和年龄的人的hash相同，这样他们就可以存放在table数组的同一个链表中
    // 然后再根据equals方法来判断是否可以加入链表
    @Override
    public boolean equals(Object o) { //比较name和age
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee01 employee = (Employee01) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() { //让相同名字和年龄的人得到相同的hash值，重写hashCode方法
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
