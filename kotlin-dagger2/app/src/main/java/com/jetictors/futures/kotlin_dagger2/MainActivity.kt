package com.jetictors.futures.kotlin_dagger2

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.e
import com.jetictors.futures.kotlin_dagger2.bean.Cloth
import com.jetictors.futures.kotlin_dagger2.bean.Clothes
import com.jetictors.futures.kotlin_dagger2.bean.Shoe
import com.jetictors.futures.kotlin_dagger2.di.component.DaggerClothComponent
import com.jetictors.futures.kotlin_dagger2.di.module.ClothModule
import com.jetictors.futures.kotlin_dagger2.di.qualifier.BlueQualifier
import com.jetictors.futures.kotlin_dagger2.di.qualifier.GreenQualifier
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

//    @field:[Named("blue")]
//    @Inject
//    lateinit var blueCloth : Cloth
//
//    @field:[Named("green")]
//    @Inject
//    lateinit var greenCloth : Cloth

    @field:[BlueQualifier]
    @Inject
    lateinit var blueCloth : Cloth

    @field:[GreenQualifier]
    @Inject
    lateinit var greenCloth : Cloth

//    @Inject lateinit var cloth : Cloth

    @Inject lateinit var shoe : Shoe
    @Inject lateinit var clothes : Clothes

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerClothComponent.builder().clothModule(ClothModule()).build().inject(this)
//        tv_value.text = cloth.color + shoe.toString() + "\n" + clothes.cloth.color  + clothes.type
        tv_value.text = blueCloth.color + shoe.toString() + "\n" + greenCloth.color + shoe.toString()
    }
}
