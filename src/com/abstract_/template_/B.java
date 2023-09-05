package com.abstract_.template_;

public class B {
    public static void job() {
        //获取开始时间
        long start = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 200000000; i++) {
            sum += i;
        }
        //获取结束时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间是 " + (end - start));
    }
}
