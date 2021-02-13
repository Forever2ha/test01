package com.kust.test;

import com.kust.dao.StudentDao;
import com.kust.util.SqlSessionUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class test03 {
    public static void main(String[] args) {
        StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
        /*List<Student> sList = studentDao.select2("zs");
        for (Student s :sList){
            System.out.println(s);
        }*/
        List<Map<String,Object>> sList = studentDao.select1();
        for (Map<String,Object> map :sList){
            Set<String> strings = map.keySet();
            for (String key:strings){
                System.out.println("key-->"+key);
                System.out.println("value-->"+map.get(key));
            }
            System.out.println("--------------");
        }
    }
}
