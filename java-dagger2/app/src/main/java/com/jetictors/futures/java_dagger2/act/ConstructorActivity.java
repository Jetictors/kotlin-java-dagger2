package com.jetictors.futures.java_dagger2.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jetictors.futures.java_dagger2.R;
import com.jetictors.futures.java_dagger2.di.component.DaggerConstructorComponent;
import com.jetictors.futures.java_dagger2.entity.Pant;

import javax.inject.Inject;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    在构造函数中注入
 * @time :   2018/2/7 15:18
 */
public class ConstructorActivity extends AppCompatActivity{

    @Inject
    Pant pant;

    private TextView mTvValue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_basis);

        mTvValue = (TextView)this.findViewById(R.id.tv_value);

        initInject();

        StringBuilder builder = new StringBuilder("");
        builder.append("Dagger2构造函数方式注入方式：")
                .append("\n")
                .append("我是 ")
                .append(pant.toString());

        mTvValue.setText(builder.toString());
    }

    private void initInject(){
        DaggerConstructorComponent.builder().build().inject(this);
    }
}
