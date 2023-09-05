package com.collection_.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","zxt");
        map.put("no2","xiaotian");
        map.put(new Car(),new Person());

        // 1.k-v 最后存放的数据类型是 HashMap$Node
        // 2.k-v 为了方便程序员的遍历，还会创建EntrySet集合,该集合存放的
        //   元素类型是Entry,而一个Entry对象就有k,v EntrySet<Entry<K,V>>
        //   就是EntrySet集合存放的数据类型是Entry类型,而Entry对象里面存放的
        //   又是k-v键值对,即 transient Set<Map.Entry<K,V>> entrySet;
        // EntrySet也是HashMap里面的一个静态内部类
        // entrySet定义的类型是Map.Entry,但是实际存放的类型是HashMap$Node
        // 这是因为 static class Node<K,V> implements Map.Entry<K,V>
        // (一个类实现了接口，那么这个类的对象就可以赋给接口)
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj : set) {
            System.out.println(obj.getClass()); //HashMap$Node
            Map.Entry entry = (Map.Entry)obj; //向上转型(Entry是一个接口类型)  obj
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        // 例如上述代码：当把HashMap$Node存放到EntrySet中就能方便遍历,
        // EntrySet提供了重要的方法   K getKey();   V getValue();

        Set set1 = map.keySet();
        Collection values = map.values();
    }
}

class Car {

}

class Person {

}
