package com.jetictors.futures.java_dagger2.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jetictors.futures.java_dagger2.R;
import com.jetictors.futures.java_dagger2.di.component.DaggerNamedComponent;
import com.jetictors.futures.java_dagger2.entity.Cloth;
import com.jetictors.futures.java_dagger2.di.modules.NamedModule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    Named注解的用法
 * @time :   2018/2/7 15:23
 */

public class NamedActivity extends AppCompatActivity {

    @Inject
    @Named("blue")
    Cloth blueCloth;

    @Inject
    @Named("green")
    Cloth greenCloth;

    private TextView mTvValue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_basis);

        mTvValue = (TextView)this.findViewById(R.id.tv_value);

        initInject();

        StringBuilder builder = new StringBuilder("");

        builder.append("Named注解：")
                .append("\n")
                .append("我是 ")
                .append(blueCloth.getColor())
                .append(" 的衣服")
                .append("\n")
                .append("我是 ")
                .append(greenCloth.getColor())
                .append(" 的衣服");

        mTvValue.setText(builder.toString());
    }

    private void initInject(){
        DaggerNamedComponent.builder().namedModule(new NamedModule()).build().inject(this);
    }
}
