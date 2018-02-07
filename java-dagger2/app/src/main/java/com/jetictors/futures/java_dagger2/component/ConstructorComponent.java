package com.jetictors.futures.java_dagger2.component;

import com.jetictors.futures.java_dagger2.act.ConstructorActivity;

import dagger.Component;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    使用构造函数方式注入
 * @time :   2018/2/7 15:20
 */

@Component
public interface ConstructorComponent {
    void inject(ConstructorActivity activity);
}
