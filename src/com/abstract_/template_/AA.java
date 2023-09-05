package com.abstract_.template_;

public class AA extends Template {

    @Override
    public void job() {
        long sum = 0;
        for (int i = 1;i < 1000000;i++) {
            sum += i;
        }
    }
}
