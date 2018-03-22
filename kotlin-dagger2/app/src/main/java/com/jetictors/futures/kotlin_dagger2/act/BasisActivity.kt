package com.jetictors.futures.kotlin_dagger2.act

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jetictors.futures.kotlin_dagger2.R
import com.jetictors.futures.kotlin_dagger2.di.component.DaggerBasisComponent
import com.jetictors.futures.kotlin_dagger2.di.module.BasisModule
import com.jetictors.futures.kotlin_dagger2.entity.Cloth
import kotlinx.android.synthetic.main.act_basis.*
import javax.inject.Inject

/**
 * @描述    :    Dagger2基本使用
 * @author  :   Jetictors
 * @time    :   2018/2/8 18:24
 * @version :   v1.0.1
 */
class BasisActivity : AppCompatActivity() {

    @Inject lateinit var cloth : Cloth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_basis)

        initInject()

        val builder = StringBuilder("")
        builder.append("Dagger2最基本的用法：")
                .append("\n")
                .append("我是   ")
                .append(cloth.color)
                .append("   的衣服")

        tv_value.text = builder.toString()
    }

    private fun initInject() {
        DaggerBasisComponent.builder().basisModule(BasisModule()).build().inject(this)
    }

}