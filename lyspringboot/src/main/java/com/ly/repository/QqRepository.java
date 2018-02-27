package com.ly.repository;

import com.ly.entity.QqEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QqRepository extends JpaRepository<QqEntity,Integer> {

    @Query
    List<QqEntity> findAllByQqGroupId(Integer qqGroupId);

}
