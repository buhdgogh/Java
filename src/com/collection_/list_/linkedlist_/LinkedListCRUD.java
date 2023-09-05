package com.collection_.list_.linkedlist_;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        /*
        源码解读：
        LinkedList linkedList = new LinkedList();
        public LinkedList() {}
        这时LinkedList的属性  first = null  last = null
         */
        linkedList.add(100);
        System.out.println(linkedList);
        // 1.add添加元素
        for (int i = 0; i < 2; i++) {
            linkedList.add(i); //底层自动装箱 Integer.valueOf(i) -> 将int i包装成Integer类
        }
        System.out.println("删除前===");
        for (Object obj :linkedList) {
            System.out.println("obj=" + obj);
        }
        // 2.remove删除元素
        // 几种删除方式：
        // 1.remove(int index) -> 删除指定位置的结点
        // 2.remove() -> 默认删除第一个结点
        // 3.remove(Object obj) -> 删除指定的元素
        // 4.removeFirst() -> 删除第一个结点
        linkedList.remove(0);
        System.out.println("删除后===");
        for (Object obj :linkedList) {
            System.out.println("obj = " + obj);
        }
        // 3.set设置修改元素
        System.out.println("====");
        linkedList.set(0,"zxt");
        for (Object obj :linkedList) {
            System.out.println("obj = " + obj);
        }
        // 4.get得到链表中的元素
        System.out.println("=====");
        Object o = linkedList.get(1);
        System.out.println(o);

        //迭代器遍历
        System.out.println("===迭代器遍历===");
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
    }
}
