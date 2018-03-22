package com.jetictors.futures.java_dagger2.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.jetictors.futures.java_dagger2.R;
import com.jetictors.futures.java_dagger2.act.dependencies.DependenciesActivity;
import com.jetictors.futures.java_dagger2.act.scope.ScopeActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mBtnBasis;
    private TextView mBtnBasisOther;
    private TextView mBtnConstructor;
    private TextView mBtnQualifier;
    private TextView mBtnNamed;
    private TextView mBtnSub;
    private TextView mBtnSingleton;
    private TextView mBtnScope;
    private TextView mBtnDependencies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        mBtnBasis.setOnClickListener(this);
        mBtnBasisOther.setOnClickListener(this);
        mBtnConstructor.setOnClickListener(this);
        mBtnQualifier.setOnClickListener(this);
        mBtnNamed.setOnClickListener(this);
        mBtnSub.setOnClickListener(this);
        mBtnSingleton.setOnClickListener(this);
        mBtnScope.setOnClickListener(this);
        mBtnDependencies.setOnClickListener(this);
    }

    private void initView() {
        mBtnBasis = (TextView) this.findViewById(R.id.btn_basis);
        mBtnBasisOther = (TextView) this.findViewById(R.id.btn_basis_other);
        mBtnConstructor = (TextView) this.findViewById(R.id.btn_constructor);
        mBtnQualifier = (TextView) this.findViewById(R.id.btn_qualifier);
        mBtnNamed = (TextView) this.findViewById(R.id.btn_named);
        mBtnSub = (TextView) this.findViewById(R.id.btn_sub);
        mBtnSingleton = (TextView) this.findViewById(R.id.btn_singleton);
        mBtnScope = (TextView) this.findViewById(R.id.btn_scope);
        mBtnDependencies = (TextView) this.findViewById(R.id.btn_dependencies);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btn_basis:
                intent.setClass(this,BasisActivity.class);
                break;
            case R.id.btn_basis_other:
                intent.setClass(this,BasisOtherActivity.class);
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
            case R.id.btn_scope:
                intent.setClass(this, ScopeActivity.class);
                break;
            case R.id.btn_singleton:
                intent.setClass(this, SingletonActivity.class);
                break;
            case R.id.btn_dependencies:
                intent.setClass(this, DependenciesActivity.class);
                break;
            default:
                break;
        }
        this.startActivity(intent);
    }
}
