package com.template.reo.fragmentfactorysample.dep

import android.app.Application
import javax.inject.Inject

class Dependency @Inject constructor(
    private val app: Application
) : IDependency {
    override fun sayMyName(): String {
        return "My name is ${app.packageName}"
    }
}