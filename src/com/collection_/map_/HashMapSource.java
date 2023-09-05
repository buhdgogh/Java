package com.collection_.map_;

import java.util.HashMap;

public class HashMapSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("java",10);
        hashMap.put("php",20);
        hashMap.put("java",20);
        /*
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;
                //判断table数组的大小,如果为空就扩容(扩容大小为16)
                if ((tab = table) == null || (n = tab.length) == 0)
                    n = (tab = resize()).length;
                //根据要添加的元素获取一个hash值,然后根据这个hash值得到要加入的k-v在table数组中的索引下标,
                //如果为改下标的位置为空就直接放入
                if ((p = tab[i = (n - 1) & hash]) == null)
                    tab[i] = newNode(hash, key, value, null);
                //如果不为空就继续判断
                else {
                    Node<K,V> e; K k;
                    //如果现有的结点和要添加的结点是同一个对象或者equals方法的返回值为true
                    if (p.hash == hash &&
                        ((k = p.key) == key || (key != null && key.equals(k))))
                        e = p;
                    //如果添加的结点是已有的红黑树   就按红黑树的方式处理
                    else if (p instanceof TreeNode)
                        e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                    //如果要加入的数据在table数组的某一个地方是一个链状结构就循环比较
                    //已有的数据的hash值和equals方法,如果都不相同就添加到链表的末尾
                    else {
                        for (int binCount = 0; ; ++binCount) {
                            if ((e = p.next) == null) {
                                p.next = newNode(hash, key, value, null);
                                //加入后判断这条链的结点的个数,如果个数达到8个就调用treeifyBin方法转变为红黑树
                                if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                    treeifyBin(tab, hash);
                                break;
                            }
                            if (e.hash == hash &&
                                ((k = e.key) == key || (key != null && key.equals(k))))
                                break;
                            p = e;
                        }
                    }
                    //如果添加的数据的hash值和已有的相同就更新value值
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                if (++size > threshold)
                    resize();
                afterNodeInsertion(evict);
                return null;
            }
         */
        // 1、创建HashMap对象  执行构造器(初始化加载因子DEFAULT_LOAD_FACTOR = 0.75)
        // 2、
    }
}
