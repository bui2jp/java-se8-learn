package com.company.myclass;

//26
public interface SampleInterface {
    static void printStatic(){
        System.out.println("aaa");
    }

    //default method
    default void printDefault(){
        System.out.println("default method");
    }
    //default method
    default void printDefault2(){
        System.out.println("default method2");
    }
    abstract void printAbstract(String instr);
}

