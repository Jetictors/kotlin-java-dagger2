package com.jetictors.futures.java_dagger2.modules;


import com.jetictors.futures.java_dagger2.entity.ChildEntity;

import dagger.Module;
import dagger.Provides;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    子级module, 主要讲解SubComponent注解的用法
 * @time :   2018/2/7 17:22
 */

@Module
public class ChildModule {

    @Provides
    public ChildEntity getChildInfo() {
        return new ChildEntity("我是子级实体类对象,存在于ChildModule中");
    }
}
