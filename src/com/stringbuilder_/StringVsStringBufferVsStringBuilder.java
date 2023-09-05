package com.stringbuilder_;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        String s = "";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        // 1.String的执行时间
        long startTime1 = System.currentTimeMillis();
        for (int i = 0;i < 20000;i++) {
            s += i;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("开始时间：" + startTime1);
        System.out.println("结束时间：" + endTime1);
        System.out.println("String的执行时间为：" + (endTime1 - startTime1));

        // 2.StringBuffer的执行时间
        long startTime2 = System.currentTimeMillis();
        for (int i = 0;i < 20000;i++) {
            stringBuffer.append(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("开始时间：" + startTime2);
        System.out.println("结束时间：" + endTime2);
        System.out.println("StringBuffer的执行时间为：" + (endTime2 - startTime2));

        // 3.StringBuilder的执行时间
        long startTime3 = System.currentTimeMillis();
        for (int i = 0;i < 20000;i++) {
            stringBuilder.append(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("开始时间：" + startTime3);
        System.out.println("结束时间：" + endTime3);
        System.out.println("StringBuffer的执行时间为：" + (endTime3 - startTime3));


    }
}
