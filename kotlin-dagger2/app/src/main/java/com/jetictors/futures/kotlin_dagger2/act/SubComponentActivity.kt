package com.jetictors.futures.kotlin_dagger2.act

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jetictors.futures.kotlin_dagger2.R
import com.jetictors.futures.kotlin_dagger2.di.component.DaggerParentComponent
import com.jetictors.futures.kotlin_dagger2.di.module.ChildModule
import com.jetictors.futures.kotlin_dagger2.di.module.ParentModule
import com.jetictors.futures.kotlin_dagger2.entity.ChildEntity
import com.jetictors.futures.kotlin_dagger2.entity.ParentEntity
import kotlinx.android.synthetic.main.act_basis.*

import javax.inject.Inject

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    SubComponent注解的用法
 * @time :   2018/2/7 17:17
 */
class SubComponentActivity : AppCompatActivity() {

    @Inject
    lateinit var parentEntity: ParentEntity

    @Inject
    lateinit var childEntity: ChildEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_basis)

        initInject()

        val builder = StringBuilder("")
        builder.append("SubComponent注解：").append("\n")
                .append(parentEntity.parentInfo)
                .append("\n")
                .append(childEntity.childInfo)
        tv_value.text = builder.toString()
    }

    private fun initInject() {
        DaggerParentComponent.builder()
                .parentModule(ParentModule())
                .build()
                .addSub(ChildModule())
                .inject(this)
    }
}
