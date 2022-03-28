package com.company.myclass;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class PrintStudent {
    public void printStudent(String title, List<Student> list){
        System.out.println(title);
        for(Student s: list){
            s.printDetail();
        }
    }

    public void printStudent(Set<Student> mySet){
        System.out.println("set ....");
        for(Student s: mySet){
            s.printDetail();
        }
    }

    public void printStudent(Map<String, Student> myMap){
        System.out.println("map ....");
        for(String k: myMap.keySet()){
            myMap.get(k).printDetail();
        }
    }
    public void printStudent2(Map<String, Optional<Student>> myMap){
        System.out.println("map2 ....");
        for(String k: myMap.keySet()){
            myMap.get(k).get().printDetail();
        }
    }
}
