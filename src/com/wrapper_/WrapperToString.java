package com.wrapper_;

public class WrapperToString {
    public static void main(String[] args) {
        //Integer -> String
        Integer i1 = 111;
        //方法一：
        String str1 = i1 + "";
        //方法二：
        String str2 = i1.toString();
        //方法三：
        String str3 = String.valueOf(i1);

        //String -> Integer
        //方法一：
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4); //parseInt返回的是int类型，因此会有自动装箱
        //方法二：
        Integer i3 = new Integer(str4);  //构造器

        System.out.println(Integer.MAX_VALUE);
    }
}

