package com.ly.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_qq")
@Entity
public class QqEntity {
    @Id
    private Integer qqId;
    private String qqName;
    private String qqAge;
    private String qqSex;
    private Integer qqGroupId;

    public Integer getQqId() {
        return qqId;
    }

    public void setQqId(Integer qqId) {
        this.qqId = qqId;
    }

    public String getQqName() {
        return qqName;
    }

    public void setQqName(String qqName) {
        this.qqName = qqName;
    }

    public String getQqAge() {
        return qqAge;
    }

    public void setQqAge(String qqAge) {
        this.qqAge = qqAge;
    }

    public String getQqSex() {
        return qqSex;
    }

    public void setQqSex(String qqSex) {
        this.qqSex = qqSex;
    }

    public Integer getQqGroupId() {
        return qqGroupId;
    }

    public void setQqGroupId(Integer qqGroupId) {
        this.qqGroupId = qqGroupId;
    }

    @Override
    public String toString() {
        return "QqEntity{" +
                "qqId=" + qqId +
                ", qqName='" + qqName + '\'' +
                ", qqAge='" + qqAge + '\'' +
                ", qqSex='" + qqSex + '\'' +
                ", qqGroupId=" + qqGroupId +
                '}';
    }

    public static void main(String[] args) {
        QqEntity qqEntity = new QqEntity();
        qqEntity.setQqAge("12");
        qqEntity.setQqGroupId(12);
        qqEntity.setQqName("aa");
        qqEntity.setQqSex("man");
        String x = qqEntity.toString();
        System.out.println(x);
    }
}