package com.jetictors.futures.java_dagger2.di.component;

import com.jetictors.futures.java_dagger2.act.QualifierActivity;
import com.jetictors.futures.java_dagger2.di.modules.QualifierModule;

import dagger.Component;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    Qualifier注解用法的Component
 * @time :   2018/2/7 16:07
 */

@Component(modules = QualifierModule.class)
public interface QualifierComponent {
    void inject(QualifierActivity activity);
}
