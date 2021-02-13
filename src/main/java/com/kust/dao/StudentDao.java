package com.kust.dao;

import com.kust.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    Student getBySno(String sno);
    void save(Student student);

    List<Student> getAll();

    List<Student> select2(String zs);

    List<Map<String, Object>> select1();
}
