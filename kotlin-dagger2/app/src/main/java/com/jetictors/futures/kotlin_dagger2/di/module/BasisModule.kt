package com.jetictors.futures.kotlin_dagger2.di.module

import com.jetictors.futures.kotlin_dagger2.entity.Cloth

import dagger.Module
import dagger.Provides

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    最基本用法之Moudel
 * @time :   2018/2/7 14:49
 */

@Module
class BasisModule {

    val cloth: Cloth
        @Provides
        get() = Cloth("红色")

}
