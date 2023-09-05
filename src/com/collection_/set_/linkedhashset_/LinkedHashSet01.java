package com.collection_.set_.linkedhashset_;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("abc");
        linkedHashSet.add("def");
        linkedHashSet.add("ghi");

        for (Object o :linkedHashSet) {
            System.out.println(o);
        }
        System.out.println(linkedHashSet);
    }
}
