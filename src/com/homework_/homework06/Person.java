package com.homework_.homework06;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        //判断当前的vehicles是不是Boat或者null
        if (!(vehicles instanceof Boat)) {
            vehicles = VehicleFactory.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        //判断当前的vehicles是不是Horse或者null
        if (!(vehicles instanceof Horse)) {
            //这里使用的是多态
            //实际：Vehicles vehicles = new Horse(); --> 向上转型
            vehicles = VehicleFactory.getHouse();
        }
        //接口调用方法
        vehicles.work();
    }

    public void passFireHill() {
        if (!(vehicles instanceof Plane)) {
            //这里使用的是多态
            //实际：Vehicles vehicles = new Horse(); --> 向上转型
            vehicles = VehicleFactory.getPlane();
        }
        //接口调用方法
        vehicles.work();
    }
}
