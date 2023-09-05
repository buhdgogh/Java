package com.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    public static void main(String[] args) {
        //三种遍历List的方法
        List list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            list.add("zxt");
        }

        // 1.iterator迭代器遍历
        System.out.println("迭代器遍历===");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next=" + next);
        }

        // 2.增强for循环遍历
        System.out.println("增强for遍历===");
        for (Object obj :list) {
            System.out.println("obj=" + obj);
        }

        // 3.普通for循环
        System.out.println("普通for循环遍历===");
        for (int i = 0;i < list.size();i++) {
            System.out.println("list" + i + "=" + list.get(i));
        }

    }
}
