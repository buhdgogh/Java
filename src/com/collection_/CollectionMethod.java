package com.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        // 1.add() -> 添加单个元素(对象)
        list.add("zxt");
        list.add(10); //这里有自动装箱机制
        list.add(true);
        //list里面的每一个元素都是一个对象
        System.out.println("list=" + list);

        // 2.remove() -> 删除指定元素(可以是具体的对象或者对象的下标)
        list.remove(1);
        System.out.println("删除index = 1后list=" + list);
        list.remove(true);
        System.out.println("删除true后list=" + list);

        // 3.contains() -> 查找某个元素是否存在
        System.out.println("查找的元素是否存在：" + list.contains("zxt"));

        // 4.size() -> 获取元素的个数
        System.out.println("list.size = " + list.size());

        // 5.isEmpty() -> 判断该集合是否为空
        System.out.println("isEmpty = " + list.isEmpty());

        // 6.clear() -> 清空集合
        list.clear();
        System.out.println(list);
        System.out.println("isEmpty = " + list.isEmpty());

        // 7.addAll() -> 添加多个元素(可以直接是集合)
        List list1 = new ArrayList();
        list1.add("zxt");
        list1.add("xyl");
        list.addAll(list1);
        System.out.println("addAll后list = " + list);

        // 8.containsAll() -> 查找多个元素是否存在
        System.out.println(list.containsAll(list1));

        // 9.removeAll() -> 删除多个元素(可以是集合(里面的所有元素))
        list.removeAll(list1);
        System.out.println("removeAll后的list = " + list);

    }
}
