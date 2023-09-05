package com.exception_.trycatch_;

public class TryCatchDetail01 {
    public static void main(String[] args) {

        try {
            String str = "张";
            int a = Integer.parseInt(str);
            System.out.println("数字a:" + a);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("==========");

        //catch可以有多个，但是捕获子类的异常要写在捕获父类的异常之前
        // 虽然有多个catch，但是只会执行一个catch
        try {
            Person person = new Person("Zhang San");
            person = null;
            System.out.println(person.getName()); //NullPointer Exception
            int n1 = 10,n2 = 0;
            int result = n1 / n2; //Arithmetic Exception
        } catch(NullPointerException e) {
            System.out.println("空指针异常" + e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println("数学运算异常" + e.getMessage());
        } catch(Exception e) {
            e.printStackTrace();
        }


        System.out.println("===========");
        System.out.println("try-finally测试");
        try {
            int n3 = 20;
            int n4 = 0;
            System.out.println(n3 / n4);
        } finally {
            System.out.println("执行finally代码块");
        }
        System.out.println("程序正常结束");

    }
}


class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}