package com.gabrielcalero.playingwithdagger2.di;

import com.gabrielcalero.playingwithdagger2.mainactivity.MainActivityModule;
import com.gabrielcalero.playingwithdagger2.secondactivity.SecondActivity;
import com.gabrielcalero.playingwithdagger2.secondactivity.SecondActivityModule;
import com.gabrielcalero.playingwithdagger2.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = { MainActivityModule.class})
    abstract MainActivity contributeMainActivityAndroidInjector();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { SecondActivityModule.class })
    abstract SecondActivity contributeSecondActivityAndroidInjector();

}
