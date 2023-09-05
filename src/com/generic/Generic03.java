package com.generic;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("StringType");
        System.out.println(stringPerson.s);
        System.out.println(stringPerson.s.getClass());
        Person<Integer> integerPerson = new Person<>(1);
        System.out.println(integerPerson.s);
        System.out.println(integerPerson.s.getClass());
    }
}

class Person<E> {
    //E表示s的数据类型,该数据类型是在定义Person对象的时候指定的,也就是在编译期间指定的
    E s;

    public Person(E s) { //参数类型为E
        this.s = s;
    }

    public E f() { //返回值类型为E
        return s;
    }
}
