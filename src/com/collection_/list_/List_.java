package com.collection_.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList();

        // 1.List接口输出的元素是按添加的元素顺序输出的
        // 可以添加重复的元素
        list.add("jack");
        list.add("tom");
        list.add("marry");
        list.add("jack");
        System.out.println("list=" + list);

        // 2.List接口支持按元素下标索引访问的(索引从0开始)
        System.out.println("index = 1的元素：" + list.get(1)); //tom
    }
}
