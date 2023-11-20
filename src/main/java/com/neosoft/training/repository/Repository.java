package com.neosoft.training.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface Repository {
    List list = new ArrayList<>();
    public default void add(Object entity) {
        list.add(entity);
    };

    public default void remove(Object entity) {
        list.remove(entity);
    };

    public default void find(Map parameters) {
//        for (parameter: parameters) {
//
//        }
    };

    public default List getList() {
        return list;
    }


    void add();

    void remove();

    void find();
}
