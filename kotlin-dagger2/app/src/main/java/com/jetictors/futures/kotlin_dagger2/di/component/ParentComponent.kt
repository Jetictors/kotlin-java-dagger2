package com.jetictors.futures.kotlin_dagger2.di.component


import com.jetictors.futures.kotlin_dagger2.di.module.ChildModule
import com.jetictors.futures.kotlin_dagger2.di.module.ParentModule
import dagger.Component

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    父级的component，主要为了讲解subComponent注解
 * @time :   2018/2/7 17:54
 */

@Component(modules = arrayOf(ParentModule::class))
interface ParentComponent {

    /**
     * 添加子级module
     * @param module
     */
    fun addSub(module: ChildModule): ChildComponent

}
