package com.template.reo.fragmentfactorysample.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.template.reo.fragmentfactorysample.MyFragmentFactory
import com.template.reo.fragmentfactorysample.ui.main.MainFragment
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Module
abstract class FragmentFactoryModule {

    @Binds
    abstract fun bindFragmentFactory(factory: MyFragmentFactory): FragmentFactory

    @Binds
    @IntoMap
    @FragmentKey(MainFragment::class)
    abstract fun bindMainFragment(fragment: MainFragment): Fragment
}

@MapKey
annotation class FragmentKey(val clazz: KClass<out Fragment>)