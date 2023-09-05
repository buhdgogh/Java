package com.collection_.set_.linkedhashset_;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Exercise01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(new Car("宝马",45.4));
        linkedHashSet.add(new Car("奥迪",50));
        linkedHashSet.add(new Car("大奔",60));

        System.out.println(linkedHashSet);
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
