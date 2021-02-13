package com.kust.domain;

public class Student {
    private String sname;
    private Integer sno;
    private Integer classno;

    public Student() {
    }

    public Student(String sname, Integer sno, Integer classno) {
        this.sname = sname;
        this.sno = sno;
        this.classno = classno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public Integer getClassno() {
        return classno;
    }

    public void setClassno(Integer classno) {
        this.classno = classno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sno=" + sno +
                ", classno=" + classno +
                '}';
    }
}
