package com.innerclass_;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //当作实参直接传递，简介高效、灵活
        f1(new IT() {
            @Override
            public void show() {
                System.out.println("传入匿名内部类实参");
            }
        });

        //传统方式
        //写一个类来实现接口IT 然后创建一个对象 通过对象来访问


    }
    public static void f1(IT it) {
        it.show();
    }

}


interface IT {
    void show();
}