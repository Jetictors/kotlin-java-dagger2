package com.jetictors.futures.java_dagger2.entity;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    子级Enity,主要讲解SubComponent注解的用法
 * @time :   2018/2/7 18:01
 */
public class ChildEntity {

    private String childInfo;

    public ChildEntity(String childInfo) {
        this.childInfo = childInfo;
    }

    public String getChildInfo() {
        return childInfo;
    }

    public void setChildInfo(String childInfo) {
        this.childInfo = childInfo;
    }

    @Override
    public String toString() {
        return "ChildEntity{" +
                "childInfo='" + childInfo + '\'' +
                '}';
    }
}
