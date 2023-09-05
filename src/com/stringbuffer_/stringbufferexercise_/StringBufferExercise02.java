package com.stringbuffer_.stringbufferexercise_;

import java.util.Scanner;

public class StringBufferExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.next();
        // 字符串得到手机的价格
        String price = scanner.next();
        // 由于要插入逗号，需要用到StringBuffer的insert方法
        // 那么需要将String转成StringBuffer类型
        StringBuffer stringBuffer = new StringBuffer(price);
        // 先获取小数点的下表索引
        // 然后在小数点的前三位插入一个逗号
        int index = stringBuffer.indexOf(".");
        for(int i = 1;i <= (index - 1) / 3;i++) {
            stringBuffer.insert(index - 3 * i,",");
        }
//        for(int i = index - 3;i > 0;i = i - 3) {
//            stringBuffer.insert(i,",");
//        }
        System.out.println("商品名\t" + "商品价格");
        System.out.print(phone + "\t" + stringBuffer);
    }
}
