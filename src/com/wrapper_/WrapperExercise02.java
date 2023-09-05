package com.wrapper_;

public class WrapperExercise02 {
    public static void main(String[] args) {

        //示例一
        //直接new对象，==比较的是是否为同一对象
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//F

        //示例二
        //和示例一同理
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//F

        //示例三
        //类似于Integer integer = 一个数;
        // 在底层的处理是：
        // Integer integer = Integer.valueOf(数);
        // 而且当数的范围在 -128~127 之间的时候，integer是从一个数组获取数的
        // 当数的范围在上述范围之外的时候，就返回创建的一个对象
        // 因此这里是从数组中获取的数，他们都是int类型，比较的是值
        Integer i5 = 127;//底层 Integer.valueOf(127)
        Integer i6 = 127;//-128~127
        System.out.println(i5 == i6); //T

        //示例四
        // 由示例三知：在范围之外，返回的是对象，因此比较两个对象是不同的
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);//F

        //示例五
        // 一个是从数组中得到是数，一个是new对象得到的数
        // 他们是不同的
        Integer i9 = 127; //Integer.valueOf(127)
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);//F

        //示例六
        //一个是new对象  一个是基本数据类型
        //他们在比较的时候，如果有基本数据类型int
        //也就是基本数据类型int和Integer比较的时候比较的是值
        Integer i11=127;
        int i12=127;
        //只有有基本数据类型，判断的是值是否相同
        System.out.println(i11==i12); //T

        //示例七
        //和示例六同理
        Integer i13=128;
        int i14=128;
        System.out.println(i13==i14);//T
    }
}
