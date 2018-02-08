package com.jetictors.futures.kotlin_dagger2.di.module

import com.jetictors.futures.kotlin_dagger2.di.qualifier.BlackQualifier
import com.jetictors.futures.kotlin_dagger2.di.qualifier.GrayQualifier
import com.jetictors.futures.kotlin_dagger2.entity.Cloth
import dagger.Module
import dagger.Provides

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    Qualifier注解用法的Moudel
 * @time :   2018/2/7 14:49
 */

@Module
class QualifierModule {

    /**
     * 绿色的衣服
     * @return
     */
    val blackCloth: Cloth
        @Provides
        @BlackQualifier
        get() = Cloth("黑色")

    /**
     * 蓝色的衣服
     * @return
     */
    val grayCloth: Cloth
        @Provides
        @GrayQualifier
        get() = Cloth("灰色")

}
