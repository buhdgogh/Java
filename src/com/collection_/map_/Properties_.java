package com.collection_.map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();

        // Properties是hashtable的子类
        // 所以Properties添加的键值对的k和v也不能是null会抛出空指针异常

        // 1、添加元素
        System.out.println("=====add=======");
        properties.put("grade", 100);
        properties.put("zxt", "handsome");
        //properties.put(null, "zxsds"); //抛出异常
        //properties.put("dasfdasd", null); //抛出异常
        properties.put("yes",100);

        System.out.println("properties = " + properties);
        System.out.println("zxt=" + properties.get("zxt"));


        //2、删除元素
        System.out.println("=====remove======");


        //3、修改
        //如何原先有,那么重新添加的时候就会修改原先的值
        //如果原先没有那么就会加上

        //4、查找


    }
}
