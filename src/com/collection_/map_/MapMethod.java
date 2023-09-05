package com.collection_.map_;

import sun.awt.windows.WPrinterJob;

import javax.imageio.stream.IIOByteBuffer;
import java.util.*;

public class MapMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        System.out.println("=====methodTest=====");
        Map methodMap = new HashMap();
        // 一、map接口的方法
        // 1、put添加
        methodMap.put("zxt" , 19);
        methodMap.put("and", 18);
        methodMap.put("handsome",20);
        methodMap.put(null, 77);
        methodMap.put("beauty", 26);
        // 2、remove删除键的映射关系
        methodMap.remove("and");
        methodMap.remove("null",77);
        // 3、get根据键获取值
        System.out.println(methodMap.get("zxt"));
        // 4、size获取元素的个数
        System.out.println(methodMap.size());
        // 5、isEmpty判断个数是否为0
        System.out.println(methodMap.isEmpty());
        // 6、clear清除
        methodMap.clear();
        System.out.println(methodMap.isEmpty());
        // 7、containsKey查找键是否存在
        System.out.println(methodMap.containsKey("handsome"));


        System.out.println("=====forTest=====");
        Map map = new HashMap();
        map.put("zxt", 19);
        map.put("and", 18);
        map.put("handsome", 20);
        map.put(null, 77);
        map.put("beauty", 26);
        // 二、map接口的遍历
        // 通过map接口的keySet方法得到map里面的所有key值
        // 方式一：增强for循环遍历
        System.out.println("=====增强for循环遍历=====");
        Set keyset = map.keySet();
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }

        // 方式二：迭代器
        System.out.println("=====迭代器迭代=====");
        Iterator iterator = keyset.iterator();
        while(iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        // 三、取出所有的values
        //由于map.value()是取出所有的values,而且没有提供方法来获取key的值,因此只能得到value
        Collection values = map.values();
        // 增强for循环遍历
        for (Object value : values) {
            System.out.println(value);
        }
        // 迭代器遍历
        System.out.println("==============");
        Iterator iterator1 = values.iterator();
        while(iterator1.hasNext()) {
            Object obj = iterator1.next();
            System.out.println(obj);
        }
        System.out.println("============");

        // 四、利用entrySet来获取k-v
        Set setentry = map.entrySet();
        System.out.println("增强for循环");
        for (Object entry : setentry) {
            // 由于entry是entry类型,我们要将其转化为map.entry的类型,
            // 然后用它提供的方法来获取key(getKey)和value(getValue)
            // 之所以这样是因为setentry实际上的类型是Node类型,但是Node类型实现了entry接口
            // 因此我们想要使用Map.entry里面的getKey和getValue方法需要转化类型
            System.out.println(entry.getClass()); //HashMap$Node -> 实现 Map.Entry(getKey、getvalue)
            //向下转型
            Map.Entry entry1 = (Map.Entry)entry;
            System.out.println(entry1.getKey() + "-" + entry1.getValue());
        }

        System.out.println("迭代器");
        Iterator iterator2 = setentry.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            System.out.println(next);
        }

    }
}
