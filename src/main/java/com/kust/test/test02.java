package com.kust.test;

import com.kust.domain.Student;
import com.kust.service.Impl.StudentServiceImpl;
import com.kust.service.StudentService;
import com.kust.util.ServiceFactory;

import java.util.List;

public class test02 {
    public static void main(String[] args) {
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
        List<Student> sList = ss.getAll();
        for (Student s : sList){
            System.out.println(s);
        }
    }
}
