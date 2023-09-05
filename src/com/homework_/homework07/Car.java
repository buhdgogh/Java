package com.homework_.homework07;

public class Car {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    class Air {
        public void flow() {
            if (temperature >= 40) {
                System.out.println("吹冷风...");
            } else if (temperature <= 0){
                System.out.println("吹热风...");
            } else {
                System.out.println("关闭空调...");
            }
        }
    }

    public Car(double temperature) {
        this.temperature = temperature;
    }
}
