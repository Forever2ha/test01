package com.kust.test;

import com.kust.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        Student s = session.selectOne("student.getBySno","1");
        System.out.println(toBlueString(s.toString()));
        System.out.println("========================================");
        List<Student> sList = session.selectList("student.getAll");
        for (Student student:sList){
            System.out.println(toBlueString(student.toString()));
        }
        System.out.println("========================================");
        /*
        添加操作
        Student student = new Student("lisi", 7, 101);
        session.insert("student.save", student);
        session.commit();*/
        //更新操作
//        Student student = new Student("lisi", 7, 102);
//        session.update("student.update",student);
//        session.commit();
        //删除操作
//        session.delete("student.delete","7");
//        session.commit();





        session.close();
    }

    public static String toBlueString(String s){
        String s1 = "\033[32;4m" + s + "\033[0m";
        return s1;
    }
}
