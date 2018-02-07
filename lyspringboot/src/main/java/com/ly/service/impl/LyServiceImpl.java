package com.ly.service.impl;

import com.ly.entity.StudentEntity;
import com.ly.repository.StudentRepository;
import com.ly.service.LyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    //判断
    if(classId.equals("2")){
        //修改
        name=name+"v";
    }
        System.out.println("id:"+id+",name="+name+",age="+age+",classId="+classId);
        StudentEntity se = new StudentEntity();
        se.setName(name);
        se.setAge(Integer.valueOf(age));
        se.setId(Long.valueOf(id));
        se.setClassId(Integer.valueOf(classId));
        studentRepository.save(se);
    }

    @Override
    public void del(String id) {
        studentRepository.delete(Long.valueOf(id));
    }

    @Override
    public StudentEntity find(String id){
      return  studentRepository.findOne(Long.valueOf(id));

    }

    @Override
    public List<StudentEntity> findAll(String classId) {

        return studentRepository.findAllByClassId(Integer.valueOf(classId));
    }


}
