package com.collection_.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        // 1.void add() -> 添加或插入元素
        list.add("jack");
        list.add(0,"tom");
        System.out.println("list.add()后=" + list);

        // 2.boolean addAll() -> 添加或插入多个元素
        List list2 = new ArrayList();
        list2.add("zxt");
        list2.add("xyl");
        list.addAll(1,list2);
        System.out.println("list.addAll()后=" + list);

        // 3.Object get(int index) -> 获取指定位置的元素
        // 4.int indexOf(Object obj) -> 返回元素在集合中首次的位置
        System.out.println(list.indexOf("tom"));
        // 5.int lastIndexOf(Object obj) -> 返回元素在集合中最后一次的位置
        System.out.println(list.lastIndexOf("jack"));
        // 6.Object remove(int index) -> 移除指定位置的元素并返回是否有该元素
        System.out.println(list.remove("j"));

        // 7.Object set(int index,Object obj) -> 设置指定位置的元素，相当于是替换(索引位置不能超出)
        // 并返回被替换位置原来的元素
        System.out.println(list.set(0,"XiaoTian"));
        System.out.println(list);

        // 8. List subList(int fromIndex,int toIndex) -> 返回fromIndex到toIndex的子集合
        // 返回子集合 fromIndex <= subIndex < int toIndex
        System.out.println(list.subList(1,3));
    }
}
