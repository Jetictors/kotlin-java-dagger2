package com.jetictors.futures.kotlin_dagger2.act

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jetictors.futures.kotlin_dagger2.R
import com.jetictors.futures.kotlin_dagger2.di.component.DaggerQualifierComponent
import com.jetictors.futures.kotlin_dagger2.di.module.QualifierModule
import com.jetictors.futures.kotlin_dagger2.di.qualifier.BlackQualifier
import com.jetictors.futures.kotlin_dagger2.di.qualifier.GrayQualifier
import com.jetictors.futures.kotlin_dagger2.entity.Cloth
import kotlinx.android.synthetic.main.act_basis.*

import javax.inject.Inject

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    Qualifier注解使用
 * @time :   2018/2/7 15:22
 */
class QualifierActivity : AppCompatActivity() {

    @Inject
    @field:[BlackQualifier]
    lateinit var blackCloth: Cloth

    @Inject
    @field:[GrayQualifier]
    lateinit var grayCloth: Cloth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_basis)

        initInject()

        val builder = StringBuilder("")
        builder.append("Qualifier注解：")
                .append("\n")
                .append("我是 ")
                .append(blackCloth.color)
                .append(" 的衣服")
                .append("\n")
                .append("我是 ")
                .append(grayCloth.color)
                .append(" 的衣服")

        tv_value.text = builder.toString()
    }

    private fun initInject() {
        DaggerQualifierComponent.builder().qualifierModule(QualifierModule()).build().inject(this)
    }
}
