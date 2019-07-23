package com.gabrielcalero.playingwithdagger2.di;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module //(subcomponents = CristoActivitySubComponent.class)
public abstract class CristoActivityModule {
/*
    @Binds
    @IntoMap
    @ClassKey(CristoActivity.class)
    abstract AndroidInjector.Factory<?>
          bindYourAndroidInjectorFactory(CristoActivitySubComponent.Factory factory);*/


    @ContributesAndroidInjector(modules = { CristoProvider.class })
    abstract CristoActivity contributeYourAndroidInjector();

}
