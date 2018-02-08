package com.jetictors.futures.java_dagger2.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jetictors.futures.java_dagger2.R;
import com.jetictors.futures.java_dagger2.di.component.DaggerParentComponent;
import com.jetictors.futures.java_dagger2.entity.ChildEntity;
import com.jetictors.futures.java_dagger2.entity.ParentEntity;
import com.jetictors.futures.java_dagger2.di.modules.ChildModule;
import com.jetictors.futures.java_dagger2.di.modules.ParentModule;

import javax.inject.Inject;

/**
 * @author :   Jetictors
 * @version :   v1.0.1
 * @描述 :    SubComponent注解的用法
 * @time :   2018/2/7 17:17
 */
public class SubComponentActivity extends AppCompatActivity {

    @Inject
    ParentEntity parentEntity;

    @Inject
    ChildEntity childEntity;

    private TextView mTvValue;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_basis);

        mTvValue = (TextView)this.findViewById(R.id.tv_value);

        initInject();

        StringBuilder builder = new StringBuilder("");
        builder.append("SubComponent注解：").append("\n")
                .append(parentEntity.getParentInfo())
                .append("\n")
                .append(childEntity.getChildInfo());
        mTvValue.setText(builder.toString());
    }

    private void initInject(){
        DaggerParentComponent.builder()
                .parentModule(new ParentModule())
                .build()
                .addSub(new ChildModule())
                .inject(this);
    }
}
