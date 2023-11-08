package com.neosoft.training.repository;

import java.util.List;

public abstract class Repository {
    private List list;

    public abstract void add();
    public abstract void remove();
    public abstract void find();


}
