package com.enum_;

//自定义枚举类型
/**
 *  枚举类型实现的方法/步骤：
 *  1.构造器私有化   不允许直接new 创建对象
 *  2.用public final static修饰这个类   让这个类暴露在外面供使用
 *  3.只提供get方法 (只读)  不允许用户修改(因为枚举类型都是固定的常量)
 */
public class Enumeration01 {
    public static void main(String[] args) {
//        Season spring = new Season("春天", "清爽");
//        Season summer = new Season("夏天", "炎热");
//        Season autumn = new Season("秋天", "凉爽");
//        Season winter = new Season("冬天", "寒冷");
        //一年四季的四个季节是固定的   如果像这样  我们无法看出这一年四个季节是固定的
        //因此引入枚举类型enumeration
        //把具体的对象列举出来就叫枚举类
        System.out.println(Season.SPRING);
    }
}

//演示自定义枚举实现
class Season {
    private String name;
    private String des;

    //定义静态的对象  供外部不new 直接用
    public final static Season SPRING = new Season("春天", "清爽");
    public final static Season SUMMER = new Season("夏天", "炎热");
    public final static Season AUTUMN = new Season("秋天", "凉爽");
    public final static Season WINTER = new Season("冬天", "寒冷");

    //1.构造器私有化 防止直接new
    //2.去掉set方法 方式属性被修改
    //3.在Season的内部创建固定的对象
    //4.优化   加入final属性  (防止类加载)
    private Season(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}