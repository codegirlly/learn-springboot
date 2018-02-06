package com.ly.service.impl;

import com.ly.entity.StudentEntity;
import com.ly.repository.StudentRepository;
import com.ly.service.LyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LyServiceImpl implements LyService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String cook() {
        return "手抓饼";
    }

    @Override
    public void add(String name, String age, String id, String classId) {
        System.out.println("id:"+id+",name="+name+",age="+age+",classId="+classId);
        StudentEntity se = new StudentEntity();
        se.setName(name);
        se.setAge(Integer.valueOf(age));
        se.setId(Long.valueOf(id));
        se.setClassId(Integer.valueOf(classId));
        studentRepository.save(se);
    }

}
