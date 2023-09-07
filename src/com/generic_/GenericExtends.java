package com.generic_;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class GenericExtends {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        //对传入的List里面的数据类型没有限制
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //限制传入的List里面的数据类型是AA类或AA类的子类
        //printCollection2(list1); //×
        //printCollection2(list2); //×
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        //限制传入的List里面的数据类型是AA类或AA类的父类(不限于直接父类)
        printCollection3(list1);
        //printCollection3(list2); //×
        printCollection3(list3);
        //printCollection3(list4); //×
        //printCollection3(list5); //×
    }
    public static void printCollection1 (List<?> e) {
        System.out.println("printCollection1");
    }
    public static void printCollection2 (List<? extends AA> e) {
        System.out.println("printCollection2");
    }
    public static void printCollection3 (List<? super AA> e) {
        System.out.println("printCollection3");
    }
}


class AA {

}

class BB extends AA {

}

class CC extends BB {

}