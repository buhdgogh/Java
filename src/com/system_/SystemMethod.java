package com.system_;

public class SystemMethod {
    public static void main(String[] args) {
        // 1.exit() 退出当前程序
        System.out.println("程序开始...");
        // exit()里面的整数表示程序的退出的状态，0表示正常退出状态
        // 即exit(0) -> 表示程序正常退出的状态
        // 提前终止程序，并且终止的时候返回值为-1
        System.exit(0);
        System.out.println("程序继续...");

        // 2.arraycopy() -> 复制数组
        // 主要理解arraycopy()方法的五个参数的含义：
        // 分别对应的是：
        // 原数组、从原数组哪个地方开始拷贝、
        // 待复制的数组、待复制数组的复制开始处的索引、
        // 从原数组拷贝多少个到新数组
//        public static native void arraycopy(Object src,  int  srcPos,
//        Object dest, int destPos,
//        int length);
//        @param      src      the source array.
//        @param      srcPos   starting position in the source array.
//        @param      dest     the destination array.
//        @param      destPos  starting position in the destination data.
//        @param      length   the number of array elements to be copied.

        int[] arr = {5,4,1,5,9};
        int[] dest = new int[3];
        System.arraycopy(arr,0,dest,0,arr.length);

        // 3.currentTimeMillis() -> 获取当前时间距1970-1-1的毫秒数
        System.out.println(System.currentTimeMillis());

        // 4.gc() -> 垃圾回收机制
    }
}
