package com.company.myclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseList01 <E>{
    private List<E> e;
    public void create(){
        this.e = new ArrayList<E>();
    }
    public List<E> get(){
        return this.e;
    }
    public void add(E element){
        this.e.add(element);
    }
    public void setArray(E[] array){
        this.e = Arrays.asList(array);
    }
    public String toString(){
        return e.toString();
    }
}
