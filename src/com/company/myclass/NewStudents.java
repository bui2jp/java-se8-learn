package com.company.myclass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewStudents {
    public List<Student> std;
    public NewStudents(){
        std = Arrays.asList(
                new Student("1aa","name1",50),
                //new Student("aa","name1",50),
                new Student("1bb","name2",70),
                new Student("2cc","name3",40),
                new Student("2dd","name4",60),
                new Student("2ee","name5",80)
        );
    }

    public List<Student> getStd(){
        return std;
    }
    public Map<String, Student> getMap(){
        Map<String, Student> mapd =
                std.stream().collect(Collectors.toMap(s -> s.getKey(), s -> s));
        return mapd;
    }
}
