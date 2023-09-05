package com.collection_.set_;

import java.util.HashSet;
import java.util.Set;

public class HomeWork01 {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        //在添加元素的时候，会返回一个boolean值，如果添加成功就返回true，否则返回false
        System.out.println(hashSet.add("jack")); //T
        System.out.println(hashSet.add("marry")); //T
        System.out.println(hashSet.add("tom")); //T
        System.out.println(hashSet.add("tom")); //F
        System.out.println(hashSet.add("zxt")); //T
        System.out.println(hashSet.add("xyl")); //T
        hashSet.remove("marry");
        System.out.println("hashSet = " + hashSet);
    }
}
