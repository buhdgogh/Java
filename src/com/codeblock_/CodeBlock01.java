package com.codeblock_;

//代码块（可以相当于构造器（也可以是对构造器的补充））
//代码块不需要通过 类 或 对象 显示调用   而是在类加载和创建对象的时候隐式调用
//场景：构造器中的重复部分太多
public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("霸总爱上我");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //分析：
    //(1) 下面的构造器中重复的代码较多
    //(2) 这样显得比较冗余
    //(3) 所以我们可以把相同的代码写到代码块中 即可 提高代码的复用性
    //(4) 这样当我们创建对象的时候 不管调用哪个构造器 代码块都会先被调用
    //(5) 在直接调用类或创建对象的时候先执行代码块再执行构造器
    {
        System.out.println("电影名...");
        System.out.println("广告...");
        System.out.println("电影正式开始...");
    }
    public Movie(String name) {
        System.out.println("Movie(String name)构造器被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("Movie(String name, double price)构造器被调用");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director)构造器被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}