package com.company.myclass;

public class Base01 <T>{
    private T t;
    public Base01(T t){
        this.t = t;
    }
    public T get(){
        return this.t;
    }
    public void set(T t){
        this.t = t;
    }
    public String toString(){
        return "Base01";
    }
}
