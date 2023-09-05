package com.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("成功","zxt",99.9));
        col.add(new Book("sad","xyl",65.6));
        col.add(new Book("adsa","asdafc",45.4));

        // 增强for循环来遍历集合或数组(只能是集合或数组)
        // 1.增强for循环在底层也是用的迭代器，
        //   因此增强for循环可以理解为迭代器的简化版
        // 2.快捷键 -> I
        for (Object book :col) {
            System.out.println("book=" + book);
        }

    }
}
