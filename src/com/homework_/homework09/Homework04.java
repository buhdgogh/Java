package com.homework_.homework09;

import com.date_.LocalDateTime_;

import java.time.LocalDateTime;

public class Homework04 {
    public static void main(String[] args) {
        String str = "6262ds6f2ds6AXDSADdas#$#@$";
        countString(str);
    }

    public static void countString(String str) {

        if(str == null) {
            System.out.println("字符串不可为空");
            return;
        }

        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numCount++;
            } else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCount++;
            } else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("数字有" + numCount + "个");
        System.out.println("小写字母有" + lowerCount + "个");
        System.out.println("大写字母有" + upperCount + "个");
        System.out.println("其他字符有" + otherCount + "个");

    }
}
