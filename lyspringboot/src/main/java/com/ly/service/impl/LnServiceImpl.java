package com.ly.service.impl;

import com.ly.entity.QqEntity;
import com.ly.repository.QqRepository;
import com.ly.service.LnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LnServiceImpl implements LnService {

@Autowired
private QqRepository qqRepository;

    @Override
    public void add(String id,String username,String userage,String usersex,String usergroupid) {
        QqEntity qe = new QqEntity();
        qe.setQqId(Integer.valueOf(id));
        qe.setQqName(username);
        qe.setQqAge(userage);
        qe.setQqSex(usersex);
        qe.setQqGroupId(Integer.valueOf(usergroupid));
        qqRepository.save(qe);
    }
}
