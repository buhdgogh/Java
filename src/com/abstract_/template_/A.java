package com.abstract_.template_;

public class A {
    public static void job() {
        //获取开始时间
        long start = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        //获取结束时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间是 " + (end - start));
    }
}
