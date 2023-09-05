package com.collection_.homework_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"all"})
public class HomeWork01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new News("新冠确诊"));
        list.add(new News("男子15151654646514654684654"));

        //倒序输出
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }


    }
}

class News { //新闻类
    private String title; //标题
    private String content; //内容

    public News(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContain() {
        return content;
    }

    public void setContain(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        if(title.length() > 15)
            return "News{" + "title=" + title.substring(0,15) + "...}"; //[0,15)
        else return "News{" + "title=" + title + '}';
    }
}
