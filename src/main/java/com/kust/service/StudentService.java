package com.kust.service;

import com.kust.domain.Student;

import java.util.List;

public interface StudentService {
    public Student getBySno(String sno);
    public void save(Student student);

    List<Student> getAll();
}
