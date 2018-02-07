package com.jetictors.futures.java_dagger2.modules;

import com.jetictors.futures.java_dagger2.entity.Cloth;

import dagger.Module;
import dagger.Provides;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    最基本用法之Moudel
 * @time :   2018/2/7 14:49
 */

@Module
public class BasisModule {

    @Provides
    public Cloth getCloth(){
        return new Cloth("红色");
    }

}
