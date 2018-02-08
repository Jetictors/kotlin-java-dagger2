package com.jetictors.futures.kotlin_dagger2.di.component;

import com.jetictors.futures.kotlin_dagger2.act.BasisActivity
import com.jetictors.futures.kotlin_dagger2.di.module.BasisModule
import dagger.Component;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    最基础用法之Compontent
 * @time :   2018/2/7 14:47
 */

@Component(modules = arrayOf(BasisModule::class))
interface BasisComponent{

    fun inject(activity: BasisActivity)

}
