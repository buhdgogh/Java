package com.enum_;

public class EnumDetail {
    public static void main(String[] args) {

    }
}

// 1.枚举类不能继承其他类 因为在底层枚举类隐式继承了Enum类 (Java是单继承机制)
// 2.enum实现的枚举类 仍然是一个类 可以实现接口 即： enum Xxx implements xxx,xxx...
enum Month {

}