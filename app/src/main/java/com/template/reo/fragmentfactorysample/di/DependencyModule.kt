package com.template.reo.fragmentfactorysample.di

import com.template.reo.fragmentfactorysample.dep.Dependency
import com.template.reo.fragmentfactorysample.dep.IDependency
import dagger.Binds
import dagger.Module

@Module
abstract class DependencyModule {

    @AppScope
    @Binds
    abstract fun bindDependency(dependency: Dependency): IDependency
}