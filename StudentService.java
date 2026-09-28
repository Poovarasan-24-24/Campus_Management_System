package com.campus.service;

import java.util.List;
import java.util.AbstractList;

public class StudentService {
    private static final List<Integer> students = new ArrayList<>();

     //get student
    public StudentStudent(){
        students.add("101 - Bill - Java");
        students.add("102 - Steve - Python");
        students.add("103 - john - C++");

    }
    public List<String> getstudents() {
        return students;
    } 
    
}