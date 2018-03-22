package com.jetictors.futures.kotlin_dagger2.act

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.jetictors.futures.kotlin_dagger2.R
import com.jetictors.futures.kotlin_dagger2.di.component.DaggerNamedComponent
import com.jetictors.futures.kotlin_dagger2.di.module.NamedModule
import com.jetictors.futures.kotlin_dagger2.entity.Cloth
import kotlinx.android.synthetic.main.act_basis.*

import javax.inject.Inject
import javax.inject.Named

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    Named注解的用法
 * @time :   2018/2/7 15:23
 */

class NamedActivity : AppCompatActivity() {

    @Inject
    @field:[Named("blue")]
    lateinit var blueCloth: Cloth

    @Inject
    @field:[Named("green")]
    lateinit var greenCloth: Cloth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_basis)

        initInject()

        val builder = StringBuilder("")
        builder.append("Named注解：")
                .append("\n")
                .append("我是 ")
                .append(blueCloth.color)
                .append(" 的衣服")
                .append("\n")
                .append("我是 ")
                .append(greenCloth.color)
                .append(" 的衣服")
        tv_value.text = builder.toString()
    }

    private fun initInject() {
        DaggerNamedComponent.builder().namedModule(NamedModule()).build().inject(this)
    }
}
