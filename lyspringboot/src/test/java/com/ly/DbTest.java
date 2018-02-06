package com.ly;


import com.ly.entity.StudentEntity;
import com.ly.repository.StudentRepository;
import com.ly.service.LyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DbTest {

    @Autowired
    private LyService lyService;
    @Autowired
    private StudentRepository studentRepository;

   @Test
    public void test(){
        System.out.println(lyService.cook());
    }

    @Test
    public void pig(){
        StudentEntity entity = new StudentEntity();
        entity.setId(2015L);
        entity.setName("anhsewe");
        entity.setAge(108);
        entity.setClassId(1);
       //studentRepository.save(entity);
//       studentRepository.delete(entity);
       List<StudentEntity> list = studentRepository.findAll();
//        for(StudentEntity se:list){
//            System.out.println(se.getName()+":"+se.getClassId());
//        }
        for(int i = 0; i<list.size();i++){
            StudentEntity sse = list.get(i);
            System.out.println(sse.getName()+":"+sse.getClassId());
        }
    }



}
