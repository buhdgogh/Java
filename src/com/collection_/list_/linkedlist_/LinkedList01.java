package com.collection_.list_.linkedlist_;

import java.security.PublicKey;

public class LinkedList01 {
    @SuppressWarnings({"all"})
    //双向链表
    public static void main(String[] args) {
        // 1.定义三个对象(结点) 此时他们没有任何关系
        Node zxt = new Node("zxt");
        Node xyl = new Node("xyl");
        Node forever = new Node("forever");

        // 2.将它们链接起来，形成双向链表
        zxt.next = xyl;
        xyl.next = forever;
        forever.prev = xyl;
        xyl.prev = zxt;
        // 定义头结点和尾结点
        Node first = zxt;
        Node last = forever;

        // 3.将他们遍历出来(从头到尾)
        System.out.println("从头到尾===");
        while (first != null) {
            System.out.println(first);
            first = first.next;
        }
        System.out.println("从尾到头===");
        while (last != null) {
            System.out.println(last);
            last = last.prev;
        }

        // 4.插入结点
        Node smith = new Node("smith");
        // 将smith插入到xyl和forever后面
        smith.next = xyl.next;
        xyl.next = smith;
        smith.prev = xyl;
        forever.prev = smith;

        //让first重新指向第一个结点
        first = zxt;
        System.out.println("从头到尾===");
        while (first != null) {
            System.out.println(first);
            first = first.next;
        }

        //让last重新指向第一个结点
        last = forever;
        System.out.println("从尾到头===");
        while (last != null) {
            System.out.println(last);
            last = last.prev;
        }
    }
}

//定义一个Node类来表示链表的一个结点
class Node {
    private Object item; //存放数据
    public Node next; //指向后一个结点
    public Node prev; //指向前一个结点

    public Node() {
        next = null;
        prev = null;
    }

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}