package com.collection_.map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //Map是一个接口
        // 1.Map和Collection并列存在，用于保存具有映射关系的数据:Key-Value(双列元素)
        // 这里用实现Map接口的hashMap来实现
        // 2.用map来存放的时候，底层是用hash来实现的(存放的是一个结点)，因此输出(存放)是无序的
        Map map = new HashMap(); //hashMap是实现了Map接口的类
        map.put("no1","zxt"); //k-y
        map.put("no2","xiaotian"); //k-y
        map.put("no3","zhang"); //k-y
        System.out.println(map);

        // 3.map里面的k-v可以是任何数据类型，都会封装到HashMap$Node对象(HashMap的静态内部类)
        // 4.map里面的k是不允许重复的，但是v是可以重复的
        map.put("no2", "123"); //这里相当于更新了k(不允许重复，只有一个)的v
        map.put("no4", "zxt"); //map中的value是可以重复的
        System.out.println(map);

        // 5.map中的k、v都可以是null，但是k只能有一个null，v可以有多个null
        map.put(null, null);
        map.put(null, "abc");
        map.put("no5", null);
        map.put("no6", null);
        System.out.println(map);
        // 7.常用String来做map的key，但是其他的数据类型也可以
        // 8.key和value是单向一一对于的关系，一个key总能找到一个value与它一一对应

        // 9.用get()成员方法来返回key对应的value
        System.out.println(map.get("no1"));

        // 10.Map接口的特点
        // Map中存放数据的key-value,一对k-v是存放在一个Node中的,
        // 由于Node实现了Entry接口,有时候说一对k-v就是一个Entry
        // 有几个k-v就是实现了几个HashMap$Node对象(Node对象是HashMap的内部类)

    }
}
