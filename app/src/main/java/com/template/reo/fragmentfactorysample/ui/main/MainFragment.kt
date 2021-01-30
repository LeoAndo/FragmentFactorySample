package com.template.reo.fragmentfactorysample.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.template.reo.fragmentfactorysample.R
import com.template.reo.fragmentfactorysample.dep.Dependency
import kotlinx.android.synthetic.main.main_fragment.*
import javax.inject.Inject

class MainFragment @Inject constructor(private val dependency: Dependency) :
    Fragment(R.layout.main_fragment) {
    private lateinit var viewModel: MainViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        message.text = dependency.sayMyName()
    }
}
