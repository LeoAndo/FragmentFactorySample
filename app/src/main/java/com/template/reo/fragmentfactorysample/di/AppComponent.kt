package com.template.reo.fragmentfactorysample.di

import android.app.Application
import com.template.reo.fragmentfactorysample.MyApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by mj on 04, December, 2019
 */
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityModule::class,
        DependencyModule::class,
        FragmentFactoryModule::class
    ]
)
@AppScope
interface AppComponent : AndroidInjector<MyApplication> {

    override fun inject(instance: MyApplication)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): AppComponent
    }
}