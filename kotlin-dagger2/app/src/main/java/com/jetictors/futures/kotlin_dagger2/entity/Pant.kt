package com.jetictors.futures.kotlin_dagger2.entity

import javax.inject.Inject

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    裤子实体类。主要用于使用构造函数方式注入的形式。会讲到@Inject、@Component
 * @time :   2018/2/7 15:28
 */
class Pant @Inject constructor() {

    override fun toString(): String {
        return "裤子"
    }
}
