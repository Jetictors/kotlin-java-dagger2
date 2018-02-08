package com.jetictors.futures.java_dagger2.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    自定义黑色衣服的Qualifier注解
 * @time :   2018/2/7 16:10
 */

@Documented
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface BlackQualifier {

}
