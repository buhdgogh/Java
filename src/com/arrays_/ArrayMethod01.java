package com.arrays_;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayMethod01 {
    public static void main(String[] args) {
        // 1.Array.toString() -> 返回数组的字符串形式
        Integer[] integer = {4,54,8};
        System.out.println(Arrays.toString(integer));
        // 2.Arrays.sort() -> 对数组进行排序(默认为从小到大)
        // 虽然排序可以用桶排、冒泡排序、快排
        // 但是可以直接调用Arrays的sort方法进行排序
        // 数组是引用数据类型 因此对形参的操作会直接影响实参
        Integer[] integers1 = {46,5,-5,16,54,5};
        System.out.println("排序前：" + Arrays.toString(integers1)) ;
        Arrays.sort(integers1);
        System.out.println("排序后：" + Arrays.toString(integers1));
        // 对于Arrays.sort() 其默认的排序是从小到大
        // 但是sort方法是重载了的 可以传入一个Comparator接口来实现定制排序
        // sort方法可以传入两个参数：
        // 1)待排序的数组
        // 2)Comparator接口(匿名内部类) -> 要求实现compare方法
        // 这里体现了接口编程的好处，看源码
        // 源码分析
        //(1) Arrays.sort(arr, new Comparator()
        //(2) 最终到 TimSort 类的 private static <T> void binarySort(T[] a, int lo, int hi, int start, // Comparator<? super T> c)()
        //(3) 执行到 binarySort 方法的代码, 会根据动态绑定机制 c.compare()执行我们传入的
        // 匿名内部类的 compare ()
        // while (left < right) {
        //     int mid = (left + right) >>> 1;
        //     if (c.compare(pivot, a[mid]) < 0)
        //     right = mid;
        //     else
        //     left = mid + 1;
        // }
        //(4) new Comparator() {
        // @Override
        // public int compare(Object o1, Object o2) {
        //     Integer i1 = (Integer) o1;
        //     Integer i2 = (Integer) o2;
        //     return i2 - i1;
        //     }
        // }
        //(5) public int compare(Object o1, Object o2) 返回的值>0 还是 <0
        // 会影响整个排序结果, 这就充分体现了 接口编程+动态绑定+匿名内部类的综合使用
        // 将来的底层框架和源码的使用方式，会非常常见
        //Arrays.sort(arr); // 默认排序方法
        //定制排序：
        Arrays.sort(integers1, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i2 - i1;
            }
        });
        System.out.println("从大到小排序为：" + Arrays.toString(integers1));
        // 6.binarySearch() -> 二叉查找(要求是已经排序了的数组，如果不是有序的数组那么就不能用)
        // 查找数组中的数组，返回该数的下标
        // 如果数组中不存在该元素就返回-1
        // 如果数组中不存在(return -(low+1))就返回 -(这个数应该在的位置 + 1)
        System.out.println("二分查找binarySearch:" + Arrays.binarySearch(integers1,16));
        System.out.println("查找不存在的数:" + Arrays.binarySearch(integers1,56));

        // 7.copyOf(array,length) -> 数组元素的复制
        // 将array数组的前length个元素复制到新的数组中
        // 如果原来的数组没有指定长度那么长，那么就会在新的数组后面增加null元素
        // 如果指定长度为0，那么新数组就是空的
        // 如果指定长度为负数，那么就会抛出异常
        // 该方法底层使用的是 System.arraycopy()
        Integer[] newArr = Arrays.copyOf(integers1,integers1.length);
        System.out.println("复制的新数组为：" + Arrays.toString(newArr));

        // 8.fill(array,num) -> 数组填充
        // 作用：将数组的元素全部变为num
        Integer[] num = new Integer[] {9,3,2};
        Arrays.fill(num,99);
        System.out.println("数组填充后的数组为：" + Arrays.toString(num));

        // 9.equals(arr1,arr2) -> 比较两个数组元素是否完全一致
        Integer[] num1 = new Integer[] {5,4,6};
        Integer[] num2 = new Integer[] {5,4,6};
        System.out.println("比较数组中的元素是否一致：" + Arrays.equals(num1,num2));

        // 10.asList() -> 将一组数据转换为集合
        // List是一个接口
        // list的编译类型为List接口
        // list的运行类型是List接口里面的一个静态内部类(java.util.Arrays$ArrayList)
        List list = Arrays.asList(1,5,4,9,1);
        System.out.println("list为：" + list);
        System.out.println("list的运行类型为：" + list.getClass());
    }
}
