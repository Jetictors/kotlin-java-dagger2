package com.jetictors.futures.kotlin_dagger2.bean

import javax.inject.Inject

/**
 * @描述    :    鞋子类
 * @author  :   Jetictors
 * @time    :   2018/2/6 16:32
 * @version :   v1.0.1
 */
class Shoe @Inject constructor(){
    override fun toString(): String {
        return "鞋子"
    }
}