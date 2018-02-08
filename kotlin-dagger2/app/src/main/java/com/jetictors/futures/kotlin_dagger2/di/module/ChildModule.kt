package com.jetictors.futures.kotlin_dagger2.di.module

import com.jetictors.futures.kotlin_dagger2.entity.ChildEntity

import dagger.Module
import dagger.Provides

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    子级module, 主要讲解SubComponent注解的用法
 * @time :   2018/2/7 17:22
 */

@Module
class ChildModule {

    val childInfo: ChildEntity
        @Provides
        get() = ChildEntity("我是子级实体类对象,存在于ChildModule中")
}
