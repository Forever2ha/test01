package com.kust.service.Impl;

import com.kust.dao.StudentDao;

import com.kust.domain.Student;
import com.kust.service.StudentService;
import com.kust.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);


    @Override
    public Student getBySno(String sno) {
        Student student = studentDao.getBySno(sno);
        return student;
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }
}
