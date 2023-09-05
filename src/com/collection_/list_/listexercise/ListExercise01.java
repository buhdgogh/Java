package com.collection_.list_.listexercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("Hello" + i);
        }
        System.out.println(list);
        // 1.在二号位插入zxt
        list.add(1,"zxt");
        System.out.println("插入后list=" + list);
        // 2.获得第五个元素
        System.out.println("list的第五个元素为" + list.get(4));
        // 3.删除第六个元素
        list.remove(5);
        System.out.println("删除第六个元素后list=" + list);
        // 4.修改第七个元素
        list.set(6,"xyl");
        System.out.println("修改第七个元素后list=" + list);

        //用迭代器遍历集合
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next=" + next);
        }
        for (Object obj :list) {
            System.out.println("obj = " + obj);
        }

    }
}
