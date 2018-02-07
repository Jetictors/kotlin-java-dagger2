package com.jetictors.futures.kotlin_dagger2.di.module

import android.graphics.Color
import com.jetictors.futures.kotlin_dagger2.bean.Cloth
import com.jetictors.futures.kotlin_dagger2.bean.Clothes
import com.jetictors.futures.kotlin_dagger2.di.qualifier.BlueQualifier
import com.jetictors.futures.kotlin_dagger2.di.qualifier.GreenQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * @描述    :    布料的module类
 * @author  :   Jetictors
 * @time    :   2018/2/6 15:22
 * @version :   v1.0.1
 */

@Module
class ClothModule {

    @Provides
    fun getCloth() : Cloth{
        return Cloth("红色")
    }

//    @Named("blue")
//    @Provides
//    fun getBlueCloth() : Cloth{
//        return Cloth("蓝色")
//    }
//
//    @Named("green")
//    @Provides
//    fun getGreenCloth() : Cloth{
//        return Cloth("绿色")
//    }

    @BlueQualifier
    @Provides
    fun getBlueCloth() : Cloth{
        return Cloth("蓝色")
    }

    @GreenQualifier
    @Provides
    fun getGreenCloth() : Cloth{
        return Cloth("绿色")
    }

    @Provides
    fun getClothes(cloth: Cloth) : Clothes{
        return Clothes(cloth,"裤子")
    }

}