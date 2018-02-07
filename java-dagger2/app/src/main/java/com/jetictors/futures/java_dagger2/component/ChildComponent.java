package com.jetictors.futures.java_dagger2.component;

import com.jetictors.futures.java_dagger2.act.SubComponentActivity;
import com.jetictors.futures.java_dagger2.modules.ChildModule;

import dagger.Subcomponent;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    父级的component，主要为了讲解subComponent注解
 * @time :   2018/2/7 17:54
 */

@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {

    void inject(SubComponentActivity activity);

}
