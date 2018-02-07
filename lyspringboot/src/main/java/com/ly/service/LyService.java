package com.ly.service;

import com.ly.entity.StudentEntity;

import java.util.List;

public interface LyService {


    String cook();
    void add(String name,String age,String id,String classId);
    void del(String id);
    StudentEntity find(String id);
    List<StudentEntity> findAll(String classId);
}
