package com.jetictors.futures.java_dagger2.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jetictors.futures.java_dagger2.R;

import dagger.Subcomponent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mBtnBasis;
    private TextView mBtnConstructor;
    private TextView mBtnQualifier;
    private TextView mBtnNamed;
    private TextView mBtnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        mBtnBasis.setOnClickListener(this);
        mBtnConstructor.setOnClickListener(this);
        mBtnQualifier.setOnClickListener(this);
        mBtnNamed.setOnClickListener(this);
        mBtnSub.setOnClickListener(this);
    }

    private void initView() {
        mBtnBasis = (TextView) this.findViewById(R.id.btn_basis);
        mBtnConstructor = (TextView) this.findViewById(R.id.btn_constructor);
        mBtnQualifier = (TextView) this.findViewById(R.id.btn_qualifier);
        mBtnNamed = (TextView) this.findViewById(R.id.btn_named);
        mBtnSub = (TextView) this.findViewById(R.id.btn_sub);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btn_basis:
                intent.setClass(this,BasisActivity.class);
                break;
            case R.id.btn_constructor:
                intent.setClass(this,ConstructorActivity.class);
                break;
            case R.id.btn_qualifier:
                intent.setClass(this,QualifierActivity.class);
                break;
            case R.id.btn_named:
                intent.setClass(this,NamedActivity.class);
                break;
            case R.id.btn_sub:
                intent.setClass(this, SubComponentActivity.class);
                break;
            default:
                break;
        }
        this.startActivity(intent);
    }
}
