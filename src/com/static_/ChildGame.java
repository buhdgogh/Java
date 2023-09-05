package com.static_;

//小孩儿玩游戏
public class ChildGame {
    public static void main(String[] args) {
        Child child1 = new Child("白骨精");
        child1.join();
        Child child2 = new Child("狐狸精");
        child2.join();
        Child child3 = new Child("老鼠精");
        child3.join();
        //类变量可以用类名访问
        System.out.println("共有" + Child.count + "个小孩儿加入了游戏");
    }
}

class Child {
    private String name;
    //定义一个类变量(静态变量) 用static修饰的变量
    //该变量的最大特点就是该变量可以被所有 Child类 实例对象共享
    public static int count = 0;
    public Child(String name) {
        this.name = name;
        count++;
    }

    public void join() {
        System.out.println(name + " 加入了游戏...");
    }
}