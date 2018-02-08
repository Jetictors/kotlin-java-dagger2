package com.jetictors.futures.kotlin_dagger2.di.component

import com.jetictors.futures.kotlin_dagger2.act.SubComponentActivity
import com.jetictors.futures.kotlin_dagger2.di.module.ChildModule

import dagger.Subcomponent

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    父级的component，主要为了讲解subComponent注解
 * @time :   2018/2/7 17:54
 */

@Subcomponent(modules = arrayOf(ChildModule::class))
interface ChildComponent {

    fun inject(activity: SubComponentActivity)

}
