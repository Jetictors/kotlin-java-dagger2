package com.jetictors.futures.java_dagger2.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jetictors.futures.java_dagger2.R;
import com.jetictors.futures.java_dagger2.component.DaggerBasisComponent;
import com.jetictors.futures.java_dagger2.entity.Cloth;
import com.jetictors.futures.java_dagger2.modules.BasisModule;

import javax.inject.Inject;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    最基本的用法，会提到@Inject、@Module、@Provides、@Component注解
 * @time :   2018/2/7 14:24
 */
public class BasisActivity extends AppCompatActivity{

    @Inject
    Cloth cloth;

    private TextView mTvValue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_basis);

        mTvValue = (TextView)this.findViewById(R.id.tv_value);

        initInject();

        StringBuilder builder = new StringBuilder("");
        builder.append("Dagger2最基本的用法：").append("\n").append("我是   ").append(cloth.getColor()).append("   的衣服");
        mTvValue.setText(builder.toString());
    }

    private void initInject(){
        DaggerBasisComponent.builder().basisModule(new BasisModule()).build().inject(this);
    }
}
