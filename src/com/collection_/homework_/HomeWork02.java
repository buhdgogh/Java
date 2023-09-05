package com.collection_.homework_;

import java.util.*;

@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("zhangsan",8888);
        hashMap.put("lisi",6666);
        System.out.println("hashMap = " + hashMap);
        hashMap.put("zhangsan",88888);

        //薪水增加100
        Set set = hashMap.keySet();
        for (Object key : set) {
            //更新
            hashMap.put(key,(Integer)hashMap.get(key) + 100);
        }
        System.out.println("hashMap = " + hashMap);

        //遍历
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            //迭代器中的每个内容是Map.Entry类型
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("遍历所有的工资");
        Collection values = hashMap.values();
        for (Object value : values) {
            System.out.println("工资 = " + value);
        }

    }
}

class Member {
    private String name;
    private double salary;

    public Member(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }
}