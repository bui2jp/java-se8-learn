package com.company.myclass;

public class Student {
    String key;
    String name;
    Integer mark;
    String result;

    public Student(String key, String name, int mark) {
        this.key = key;
        this.name = name;
        this.mark = mark;
        this.result = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    void printDetail(){
        String result_ = "";
        if (getResult() != null) result_ = getResult();
        System.out.println(
                getKey() + " " + getKey() +
                        " " + getName() +
                        " " + getMark() +
                        " " + result_
        );
    }
}
