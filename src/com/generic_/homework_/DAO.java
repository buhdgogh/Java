package com.generic_.homework_;

import java.util.*;

public class DAO <T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        //方法1
//        Collection<T> values = map.values();
//        return new ArrayList<>(values);
        //方法2
        ArrayList<T> list = new ArrayList<>();
        Set<String> set = map.keySet();
        for (String s : set) {
            list.add(map.get(s));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}
