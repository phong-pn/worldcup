package com.proxglobal.worlcupapp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<T: ViewDataBinding>: Fragment() {
    private var _binding: T? = null
    protected val binding: T
        get() = _binding as T

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = getDataBinding()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}