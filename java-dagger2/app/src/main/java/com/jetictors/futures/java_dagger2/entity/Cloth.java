package com.jetictors.futures.java_dagger2.entity;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    衣服实体类，该类具有一个颜色的属性,在例子中我会用到这个属性值
 * @time :   2018/2/7 14:56
 */
public class Cloth {

    private String color;

    public Cloth(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "color='" + color + '\'' +
                '}';
    }
}
