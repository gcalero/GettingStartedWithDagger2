package com.gabrielcalero.playingwithdagger2.ui;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainActivitySubComponent.class)
public abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<?>
    bindYourAndroidInjectorFactory(MainActivitySubComponent.Factory factory);

    /*@ContributesAndroidInjector(modules = { MainActivityProvider.class})
    abstract MainActivity contributeYourAndroidInjector();*/
}
