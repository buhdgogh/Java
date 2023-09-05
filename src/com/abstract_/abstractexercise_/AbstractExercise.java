package com.abstract_.abstractexercise_;

public class AbstractExercise {
    public static void main(String[] args) {
        CommonEmployee tom = new CommonEmployee("tom", 11, 5000);
        Manager jack = new Manager("jack", 1, 10000, 2500);
        tom.work();
        jack.work();
    }
}
