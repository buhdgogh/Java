package com.collection_.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        // 1.Set接口是无序的(添加和取出的顺序不一样)  没有索引
        // 2.不允许含有重复的元素  只能有一个null
        // 3.虽然添加和取出的顺序不同，但是取出的顺序是固定的
        Set set = new HashSet();
        set.add("jack");
        set.add("tom");
        set.add("jack");
        set.add("smith");
        set.add(123);
        set.add(null);
        set.add(null);

        // Set接口的遍历方式：
        // 可以使用迭代器遍历，也可以使用增强for循环遍历，
        // 但是不能用普通for循环遍历，因为没有索引
        // 1.迭代器遍历
        System.out.println("===迭代器遍历===");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        // 2.增强for循环遍历
        System.out.println("===增强for循环遍历===");
        for (Object o :set) {
            System.out.println("obj = " + o);
        }

    }
}
