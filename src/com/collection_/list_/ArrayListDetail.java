package com.collection_.list_;

import java.util.ArrayList;

public class ArrayListDetail {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(8);
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for (int i = 11;i <= 15;i++) {
            list.add(i);
        }

        list.add(100);

    }
}
