package com.jetictors.futures.java_dagger2.modules;

import com.jetictors.futures.java_dagger2.entity.Cloth;
import com.jetictors.futures.java_dagger2.qualifier.BlackQualifier;
import com.jetictors.futures.java_dagger2.qualifier.GrayQualifier;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    Qualifier注解用法的Moudel
 * @time :   2018/2/7 14:49
 */

@Module
public class QualifierModule {

    /**
     * 绿色的衣服
     * @return
     */
    @Provides
    @BlackQualifier
    public Cloth getBlackCloth(){
        return new Cloth("黑色");
    }

    /**
     * 蓝色的衣服
     * @return
     */
    @Provides
    @GrayQualifier
    public Cloth getGrayCloth(){
        return new Cloth("灰色");
    }

}
