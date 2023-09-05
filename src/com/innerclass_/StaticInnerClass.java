package com.innerclass_;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer07 outer07 = new Outer07();
        outer07.m1();

        //外部其他类访问静态内部类的方式：

        //方式一：
        //由于静态内部类是静态的(static)的成员,所以可以通过外部类.内部类的形式创建
        Outer07.Inner07 inner07 = new Outer07.Inner07();
        inner07.say();

        //方式二：
        //在外部类中写一个方法来返回这个静态内部类
        Outer07.Inner07 inner07Instance = outer07.getInner07Instance();
        inner07Instance.say();

    }
}

class Outer07 {
    public int n1 = 100;
    public static String name = "张三";

    // 静态内部类：
    // 1.有static修饰的类
    // 2.可以访问外部类的所有静态成员，但是不能访问非静态成员
    // 3.作用域：和其他成员一样，为整个类体
    // 4.可以用访问修饰符修饰 因为他的地位就是一个成员
     static class Inner07 {
         public static String name = "李四";
         public void say() {
            //当外部类和静态内部类的成员命名一样时 遵循就近原则
            //如果想要访问外部类的成员 那么可以用类名.属性即可
             System.out.println(name); //就近原则
             System.out.println(Outer07.name); //访问外部类的成员
             System.out.println("Inner07里面的say方法");
         }
    }

    //编写方法，返回静态内部类的对象实例
    //返回静态的和非静态的都可以
    public Inner07 getInner07Instance() {
         return new Inner07();
    }

//    public static Inner07 getInner07Instance() {
//        return new Inner07();
//    }
    public void m1() {
        System.out.println(name);
    }
}
