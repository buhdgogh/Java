package com.innerclass_;

import com.interface_.Phone;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        //传递的是实现接口的匿名内部类 InnerClassExercise02$1
        //匿名内部类重写了ring()方法
        //Bell bell = new Bell() {
        //            @Override
        //            public void ring() {
        //                System.out.println("懒猪起床了...");
        //            }
        //        }
        CellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println(this.getClass());
                System.out.println("懒猪起床了...");
            }
        });
        //传递的是实现接口的匿名内部类 InnerClassExercise02$2
        CellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println(this.getClass());
                System.out.println("小伙伴上课了...");
            }
        });
    }
}


interface Bell {
    void ring();
}

class CellPhone {
    public static void alarmClock(Bell bell) {
        bell.ring();
    }
}
