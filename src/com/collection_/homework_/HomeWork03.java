package com.collection_.homework_;

import com.collection_.set_.TreeSet_;

import java.util.TreeSet;

@SuppressWarnings({"all"})
public class HomeWork03 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person());
        treeSet.add(new Person());
        //由于compareTo方法返回的都是0,所以只会添加进一个对象
        System.out.println(treeSet);
    }
}

class Person implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
