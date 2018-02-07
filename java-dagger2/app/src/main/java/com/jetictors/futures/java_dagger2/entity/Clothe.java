package com.jetictors.futures.java_dagger2.entity;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    服装店实体类。
 * @time :   2018/2/7 15:48
 */
public class Clothe {

    private Cloth cloth;
    private Pant pant;

    public Clothe(Cloth cloth, Pant pant) {
        this.cloth = cloth;
        this.pant = pant;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public Pant getPant() {
        return pant;
    }

    public void setPant(Pant pant) {
        this.pant = pant;
    }

    @Override
    public String toString() {
        return "Clothe{" +
                "cloth=" + cloth +
                ", pant=" + pant +
                '}';
    }
}
