package com.jetictors.futures.java_dagger2.entity;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    父级Enity,主要讲解SubComponent注解的用法
 * @time :   2018/2/7 18:01
 */
public class ParentEntity {

    private String parentInfo;

    public ParentEntity(String parentInfo) {
        this.parentInfo = parentInfo;
    }

    public String getParentInfo() {
        return parentInfo;
    }

    public void setParentInfo(String parentInfo) {
        this.parentInfo = parentInfo;
    }

    @Override
    public String toString() {
        return "ParentEntity{" +
                "parentInfo='" + parentInfo + '\'' +
                '}';
    }
}
