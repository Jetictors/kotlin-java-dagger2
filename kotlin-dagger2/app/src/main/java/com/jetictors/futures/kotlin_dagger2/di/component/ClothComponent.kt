package com.jetictors.futures.kotlin_dagger2.di.component

import com.jetictors.futures.kotlin_dagger2.MainActivity
import com.jetictors.futures.kotlin_dagger2.di.module.ClothModule
import dagger.Component

/**
 * @描述    :    布料类的component类
 * @author  :   Jetictors
 * @time    :   2018/2/6 15:26
 * @version :   v1.0.1
 */

@Component(modules = arrayOf(ClothModule::class))
interface ClothComponent{

    fun inject(activity: MainActivity)

}