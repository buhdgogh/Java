package com.collection_.set_;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {

        // 如果使用无参构造创建TreeSet的时候,添加进去后的数据仍然是无序的
        // 如果想要添加的数据按照字典序进行排序,
        // 那么可以使用TreeSet提供的一个构造器,这个构造器可以传入一个参数

        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用String的compareTo方法进行字符串大小的比较
                //return ((String) o1).compareTo((String) o2);
                //在底层的构造器中循环比较字符串中对应字母的大小,如果遇到相等的就返回0
                //也就是说如果添加ab后添加abc,由于第一个字符都是a,也就是相等的,
                //那么在比较器比较的时候就会返回0
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        //1、添加add
        treeSet.add("zxt");
        treeSet.add("and");
        treeSet.add("handsome");

        System.out.println("treeSet = " + treeSet);

        System.out.println("treeSet不允许添加相同的key");
        treeSet.add("zxt");
        System.out.println("treeSet = " + treeSet);


        //如果按照字符大小进行排序
        treeSet.add("zxtfdfa");
        System.out.println("treeSet = " + treeSet);
    }
}
