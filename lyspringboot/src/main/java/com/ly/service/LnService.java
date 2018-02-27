package com.ly.service;

import com.ly.entity.QqEntity;

import java.util.List;

public interface LnService {

    void add(String userid,String username,String userage,String usersex,String usergroupid);
    QqEntity findqq(String usergroupid);
    List<QqEntity> findAll(String usergroupid);
}
