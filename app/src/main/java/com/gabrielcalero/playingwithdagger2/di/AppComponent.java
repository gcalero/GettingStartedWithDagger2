package com.gabrielcalero.playingwithdagger2.di;

import android.content.Context;

import com.gabrielcalero.playingwithdagger2.App;
import com.gabrielcalero.playingwithdagger2.ui.MainActivityModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, MainActivityModule.class, CristoActivityModule.class})
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance Builder context(Context context);
        AppComponent build();
    }

    //public Map<String, Integer> positiveNumbers();
}
