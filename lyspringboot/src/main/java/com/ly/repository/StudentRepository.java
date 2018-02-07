package com.ly.repository;

import com.ly.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity,Long>{

        @Query
        List<StudentEntity> findAllByClassId(Integer classId);

}
