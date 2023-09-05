package com.homework_.homework09;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

public class Homework03 {
    public static void main(String[] args) {
        printName("Zhang xiao Tian");
    }

    public static void printName(String name) {
        if (name == null) {
            System.out.println("name不能为空");
            return;
        }
        //对输入的数按空格分割
        String[] names = name.split(" ");
        if(names.length != 3) {
            System.out.println("输入的name格式不对");
            return;
        }

        String format = String.format("%s,%s .%c",names[2],names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }

}
