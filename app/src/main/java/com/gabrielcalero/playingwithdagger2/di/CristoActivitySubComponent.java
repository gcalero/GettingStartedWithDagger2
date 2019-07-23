package com.gabrielcalero.playingwithdagger2.di;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = CristoProvider.class)
public interface CristoActivitySubComponent extends AndroidInjector<CristoActivity> {

    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CristoActivity> {}

}
