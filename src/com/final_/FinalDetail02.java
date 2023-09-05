package com.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.RTX);
    }
}

//用final修饰类后,类里面的方法可以不写final
final class AAA {

}

//在实际应用中,往往将static和final搭配使用,效率更高,这样不会导致类加载,底层对编译器的优化
class BBB {
    public final static int RTX = 3090;

    static {
        System.out.println("执行BBB 的静态代码块");
    }
}
