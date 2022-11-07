package com.proxglobal.worlcupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proxglobal.worlcupapp.base.BaseActivity
import com.proxglobal.worlcupapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getDataBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}