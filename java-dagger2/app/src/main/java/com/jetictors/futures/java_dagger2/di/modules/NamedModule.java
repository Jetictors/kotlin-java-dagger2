package com.jetictors.futures.java_dagger2.di.modules;

import com.jetictors.futures.java_dagger2.entity.Cloth;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    Named注解用法的Moudel
 * @time :   2018/2/7 14:49
 */

@Module
public class NamedModule {

    /**
     * 绿色的衣服
     * @return
     */
    @Provides
    @Named("green")
    public Cloth getGreenCloth(){
        return new Cloth("绿色");
    }

    /**
     * 蓝色的衣服
     * @return
     */
    @Provides
    @Named("blue")
    public Cloth getBlueCloth(){
        return new Cloth("蓝色");
    }

}
