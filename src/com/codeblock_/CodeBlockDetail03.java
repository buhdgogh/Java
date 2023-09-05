package com.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
        /*
        结果：
        调用AAA 的静态代码块
        调用BBB 的静态代码块
        调用AAA 的非静态代码块
        调用AAA 的无参构造器
        调用BBB 的非静态代码块
        调用BBB 的无参构造器
        */
        /*
         结果分析：
         在执行BBB bbb = new BBB(); 的时候首先需要加载类信息
         在加载BBB前分析到BBB是AAA的子类 所以要先加载AAA类信息 再加载BBB类信息
         加载AAA类信息和BBB类信息就会先执行他们的静态代码块
         加载完后就会执行BBB类的无参构造器
         (注意这里说是无参构造器 但是实际上再无参构造器中先执行非静态代码块)
         而无参构造器中又隐含super();来调用父类的无参构造器
         所以先执行父类的无参构造器
         而无参构造器中是先执行非静态代码块的
         因此输出 调用AAA 的非静态代码块
         然后执行构造器 输出 调用AAA 的无参构造器
         到此父类构造器执行完毕 接下来执行子类BBB的无参构造器
         输出 调用BBB 的非静态代码块 调用BBB 的无参构造器
        */

        /*
        结论：
        创建一个子类时的调用顺序：
        1、父类的 静态代码块 和 静态变量初始化
        2、子类的 静态代码块 和 静态变量初始化
        3、父类的 非静态代码块 和 非静态变量初始化
        4、父类的 构造器
        5、子类的 非静态代码块 和 非静态变量初始化
        6、子类的 构造器
        7、静态代码块只能调用 静态变量      非静态代码块既能调用 静态变量 也能调用 非静态变量
        */

    }
}

class AAA {
    static {
        System.out.println("调用AAA 的静态代码块");
    }
    {
        System.out.println("调用AAA 的非静态代码块");
    }
    public AAA() {
        //super(); 隐含调用父类的无参构造器
        //非静态代码块和非静态属性初始化
        System.out.println("调用AAA 的无参构造器");
    }
}

class BBB extends AAA {
    static {
        System.out.println("调用BBB 的静态代码块");
    }
    {
        System.out.println("调用BBB 的非静态代码块");
    }
    public BBB() {
        //super(); 隐含调用父类的无参构造器
        //非静态代码块和非静态属性初始化
        System.out.println("调用BBB 的无参构造器");
    }
}