package com.jetictors.futures.kotlin_dagger2.di.module

import com.jetictors.futures.kotlin_dagger2.entity.Cloth

import javax.inject.Named

import dagger.Module
import dagger.Provides

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    Named注解用法的Moudel
 * @time :   2018/2/7 14:49
 */

@Module
class NamedModule {

    /**
     * 绿色的衣服
     * @return
     */
    val greenCloth: Cloth
        @Provides
        @Named("green")
        get() = Cloth("绿色")

    /**
     * 蓝色的衣服
     * @return
     */
    val blueCloth: Cloth
        @Provides
        @Named("blue")
        get() = Cloth("蓝色")

}
