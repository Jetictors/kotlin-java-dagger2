package com.jetictors.futures.kotlin_dagger2.act

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.jetictors.futures.kotlin_dagger2.R
import com.jetictors.futures.kotlin_dagger2.di.component.DaggerConstructorComponent
import com.jetictors.futures.kotlin_dagger2.entity.Pant
import kotlinx.android.synthetic.main.act_basis.*

import javax.inject.Inject

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    在构造函数中注入
 * @time :   2018/2/7 15:18
 */
class ConstructorActivity : AppCompatActivity() {

    @Inject
    lateinit var pant: Pant

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_basis)

        initInject()

        val builder = StringBuilder("")
        builder.append("Dagger2构造函数方式注入方式：").append("\n").append("我是   ").append(pant.toString())
        tv_value.text = builder.toString()
    }

    private fun initInject() {
        DaggerConstructorComponent.builder().build().inject(this)
    }
}
