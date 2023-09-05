package com.collections_;

import java.util.*;

@SuppressWarnings({"all"})
public class Collection_ {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("sadsada");
        list.add(545);
        list.add("fdfda");
        list.add(8899);
        list.add(656.65);

        System.out.println("list = " + list);

        // 1、reverse方法   将list翻转
        System.out.println("=====翻转list=====");
        Collections.reverse(list);
        System.out.println("翻转list = " + list);

        // 2、shuffle方法    对list进行随机排序
        System.out.println("=====随机排序=====");
        for(int i = 0; i < 5; i++) {
            Collections.shuffle(list);
            System.out.println("随机排序第" + (i + 1) + "次的list = " + list);
        }

        // 3、sort方法
        // (1)对list按自然顺序进行从小到大排序
        System.out.println("=====sort排序=====");
        ArrayList arrayList = new ArrayList();
        arrayList.add("asds");
        arrayList.add("gfev");
        arrayList.add("fetbt");
        System.out.println("arrayList = " + arrayList);
        Collections.sort(arrayList);
        System.out.println("arrayList = " + arrayList);

        // (2)传入比较器   按照比较器的要求进行排序
        Collections.sort(arrayList, new Comparator() {
            @Override //重写compare方法
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String) {
                    return ((String)o1).length() - ((String)o2).length();
                } else return 0;
            }
        });
        System.out.println("按照长度进行排序后的结果为:");
        System.out.println("arrayList = " + arrayList);

        // 4、swap(list, i, j)  指定位置交换
        System.out.println("=====swap交换=====");
        System.out.println("list = " + list);
        Collections.swap(list,0,1);
        System.out.println("list = " + list);

        // 5、max返回最大的元素
        System.out.println("=====max返回最大的元素=====");
        // (1)按照自然排序后的位置返回
        System.out.println("自然排序最大的为：" + Collections.max(arrayList));
        // (2)传入比较器  按照比较器指定的规则进行进行排序得到最大的元素
        Object maxobj = Collections.max(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String) {
                    return ((String)o1).length() - ((String)o2).length();
                } else return 0;
            }
        });
        System.out.println("比较器最大元素为：" + maxobj);

        // 6、min返回最小元素  -->和max类似

        // 7、frequency统计某个元素出现的次数
        System.out.println("=====frequency统计出现的次数=====");
        System.out.println("fetbt出现的次数 = " + Collections.frequency(arrayList,"fetbt"));

        // 8、copy拷贝集合  copy(List dest,List src)  将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        //为了完成一个完整拷贝,我们需要先给 dest 赋值,大小和 list.size()一样
        for(int i = 0; i < list.size() + 1; i++) {
            dest.add("a");
        }
        //拷贝
        Collections.copy(dest, list);
        System.out.println("dest=" + dest);

        // 9、boolean replaceAll(List list，Object oldVal，Object newVal)
        // 使用新值替换 List 对象的所有旧值,如果 list 中,有 tom 就替换成 汤姆


    }
}
