package com.enum_;

//enum关键字来实现枚举类型
/**
 *
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);

    }
}

//用enum关键字来实现枚举类
enum Season2 {

    //定义静态的对象  供外部不new 直接用
//    public final static Season SPRING = new Season("春天", "清爽");
//    public final static Season SUMMER = new Season("夏天", "炎热");
//    public final static Season AUTUMN = new Season("秋天", "凉爽");
//    public final static Season WINTER = new Season("冬天", "寒冷");


    //实现方法/步骤：
    // 1.用enum替代class
    // 2.用SPRING替代public final static Season SPRING = new Season("春天", "清爽");
    // 3.常量名/变量名后面加一个构造器
    //   SPRING("春天","清爽");  解读   常量名(实参列表)
    // 4.如果有多个常量/枚举类，那么用 , 间隔即可
    // 5.如果使用enum来实现枚举类   要求将常量对象写在最前面
    // 6.如果使用无参构造器创建对象  则实参列表和()都可省略
    SPRING("春天","清爽"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");;
    private String name;
    private String des;


    //1.构造器私有化 防止直接new
    //2.去掉set方法 方式属性被修改
    //3.在Season的内部创建固定的对象
    //4.优化   加入final属性  (防止类加载)
    private Season2(String name, String des) {
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


