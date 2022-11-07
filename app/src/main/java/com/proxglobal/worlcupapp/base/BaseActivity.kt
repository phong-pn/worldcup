package com.proxglobal.worlcupapp.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding
import com.proxglobal.worlcupapp.databinding.ActivityMainBinding

abstract class BaseActivity<T: ViewBinding>: AppCompatActivity() {
    private var _binding: T? = null
    protected val binding: T
        get() = _binding as T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getDataBinding()
        setContentView(_binding!!.root)
        initViewModel()
        addEvent()
        addObservers()
        initData()
    }

    abstract fun getDataBinding(): T

    open fun initViewModel() {}

    open fun addEvent() {}

    open fun addObservers() {}

    open fun initData() {}

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}