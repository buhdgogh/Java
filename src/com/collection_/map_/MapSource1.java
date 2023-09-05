package com.collection_.map_;

import java.util.HashMap;
import java.util.Objects;

public class MapSource1 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for(int i =0;i < 12;i++) {
            hashMap.put(new A(i), "hello");
        }

        System.out.println("hashmap = " + hashMap); //12个k-v
    }
}

class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() { //所有对象的hashcode的值都是100
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}