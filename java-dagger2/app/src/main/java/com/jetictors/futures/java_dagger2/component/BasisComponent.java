package com.jetictors.futures.java_dagger2.component;

import com.jetictors.futures.java_dagger2.act.BasisActivity;
import com.jetictors.futures.java_dagger2.modules.BasisModule;

import dagger.Component;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    最基础用法之Compontent
 * @time :   2018/2/7 14:47
 */

@Component(modules = BasisModule.class)
public interface BasisComponent {

    void inject(BasisActivity activity);

}
