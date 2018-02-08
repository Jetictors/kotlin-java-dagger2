package com.jetictors.futures.java_dagger2.di.component;

import com.jetictors.futures.java_dagger2.act.NamedActivity;
import com.jetictors.futures.java_dagger2.di.modules.NamedModule;

import dagger.Component;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    Named注解用法的Component
 * @time :   2018/2/7 15:53
 */

@Component(modules = NamedModule.class)
public interface NamedComponent {
    void inject(NamedActivity activity);
}
