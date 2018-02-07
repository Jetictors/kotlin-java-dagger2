package com.jetictors.futures.kotlin_dagger2.app

import android.app.Application
import com.jetictors.futures.kotlin_dagger2.bean.Cloth
import javax.inject.Inject

/**
 * @描述    :    application
 * @author  :   Jetictors
 * @time    :   2018/2/6 16:51
 * @version :   v1.0.1
 */

class MyApplication : Application(){

    @Inject lateinit var cloth : Cloth

    override fun onCreate() {
        super.onCreate()
    }

}