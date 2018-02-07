package com.jetictors.futures.java_dagger2.modules;

import com.jetictors.futures.java_dagger2.entity.ParentEntity;

import dagger.Module;
import dagger.Provides;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    父级module, 主要讲解SubComponent注解的用法
 * @time :   2018/2/7 17:20
 */

@Module
public class ParentModule {

    @Provides
    public ParentEntity getParentInfo(){
        return new ParentEntity("我是父级实体类对象,存在于ParentModule中");
    }

}
