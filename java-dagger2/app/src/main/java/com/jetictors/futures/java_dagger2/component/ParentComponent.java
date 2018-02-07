package com.jetictors.futures.java_dagger2.component;

import com.jetictors.futures.java_dagger2.modules.ChildModule;
import com.jetictors.futures.java_dagger2.modules.ParentModule;

import dagger.Component;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    父级的component，主要为了讲解subComponent注解
 * @time :   2018/2/7 17:54
 */

@Component(modules = ParentModule.class)
public interface ParentComponent {

    /**
     * 添加子级module
     * @param module
     */
    ChildComponent addSub(ChildModule module);

}
