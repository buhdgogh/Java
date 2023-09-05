package com.abstract_.template_;

public class BB extends Template {
    @Override
    public void job() {
        long sum = 0;
        for (int i = 1; i < 800000; i++) {
            sum += i;
        }
    }
}
