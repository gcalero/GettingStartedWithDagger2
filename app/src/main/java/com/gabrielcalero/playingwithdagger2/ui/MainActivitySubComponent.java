package com.gabrielcalero.playingwithdagger2.ui;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = MainActivityProvider.class)
public interface MainActivitySubComponent extends AndroidInjector<MainActivity> {

    /** This factory creates the injector for MainActivity: MainActivitySubComponent */
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}

}
