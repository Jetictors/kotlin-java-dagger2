package com.jetictors.futures.kotlin_dagger2.act

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jetictors.futures.kotlin_dagger2.R
import com.jetictors.futures.kotlin_dagger2.act.dependencies.DependenciesActivity
import com.jetictors.futures.kotlin_dagger2.act.scope.ScopeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListener()
    }

    private fun initListener(){

        btn_basis.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this,BasisActivity::class.java))
            return@setOnClickListener
        }

        btn_constructor.setOnClickListener {
            startActivity( intent.setClass(MainActivity@this,ConstructorActivity::class.java))
            return@setOnClickListener
        }

        btn_basis_other.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this,BasisOtherActivity::class.java))
            return@setOnClickListener
        }

        btn_named.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this,NamedActivity::class.java))
            return@setOnClickListener
        }

        btn_qualifier.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this,QualifierActivity::class.java))
            return@setOnClickListener
        }

        btn_sub.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this,SubComponentActivity::class.java))
            return@setOnClickListener
        }

        btn_scope.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this, ScopeActivity::class.java))
            return@setOnClickListener
        }

        btn_singleton.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this,SingletonActivity::class.java))
            return@setOnClickListener
        }

        btn_dependencies.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this,DependenciesActivity::class.java))
        }

    }

}