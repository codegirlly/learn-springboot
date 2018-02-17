package com.ly.entity;


import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_qqgroup")
public class QqGroupEntity {

    private String groupName;
    @Id
    private int groupId;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
