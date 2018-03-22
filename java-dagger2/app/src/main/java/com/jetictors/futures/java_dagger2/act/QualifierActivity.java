package com.jetictors.futures.java_dagger2.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jetictors.futures.java_dagger2.R;
import com.jetictors.futures.java_dagger2.di.component.DaggerQualifierComponent;
import com.jetictors.futures.java_dagger2.entity.Cloth;
import com.jetictors.futures.java_dagger2.di.modules.QualifierModule;
import com.jetictors.futures.java_dagger2.di.qualifier.BlackQualifier;
import com.jetictors.futures.java_dagger2.di.qualifier.GrayQualifier;

import javax.inject.Inject;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    Qualifier注解使用
 * @time :   2018/2/7 15:22
 */
public class QualifierActivity extends AppCompatActivity{

    @Inject
    @BlackQualifier
    Cloth blackCloth;

    @Inject
    @GrayQualifier
    Cloth grayCloth;

    private TextView mTvValue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_basis);

        mTvValue = (TextView)this.findViewById(R.id.tv_value);

        initInject();

        StringBuilder builder = new StringBuilder("");
        builder.append("Qualifier注解：")
                .append("\n")
                .append("我是 ")
                .append(blackCloth.getColor())
                .append(" 的衣服")
                .append("\n")
                .append("我是 ")
                .append(grayCloth.getColor())
                .append(" 的衣服");

        mTvValue.setText(builder.toString());
    }

    private void initInject(){
        DaggerQualifierComponent.builder().qualifierModule(new QualifierModule()).build().inject(this);
    }
}
