package com.jetictors.futures.kotlin_dagger2.act

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jetictors.futures.kotlin_dagger2.R
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
        }

        btn_basis_other.setOnClickListener {
//            startActivity(intent.setClass(MainActivity@this,SubComponentActivity::class.java))
        }

        btn_constructor.setOnClickListener {
            startActivity( intent.setClass(MainActivity@this,ConstructorActivity::class.java))
        }

        btn_named.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this,NamedActivity::class.java))
        }

        btn_qualifier.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this,QualifierActivity::class.java))
        }

        btn_sub.setOnClickListener {
            startActivity(intent.setClass(MainActivity@this,SubComponentActivity::class.java))
        }

        btn_scope.setOnClickListener {
//            startActivity(intent.setClass(MainActivity@this,SubComponentActivity::class.java))
        }

        btn_singleton.setOnClickListener {
//            startActivity(intent.setClass(MainActivity@this,SubComponentActivity::class.java))
        }

        btn_dependencies.setOnClickListener {
//            startActivity(intent.setClass(MainActivity@this,SubComponentActivity::class.java))
        }

    }

}