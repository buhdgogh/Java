package com.abstract_.template_;

abstract public class Template {
        public abstract void job();

        public void calculate() {
            //获取开始时间
            long start = System.currentTimeMillis();
            job(); //动态绑定机制
            //获取结束时间
            long end = System.currentTimeMillis();
            System.out.println("执行时间是 " + (end - start));
        }
}
