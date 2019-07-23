package com.gabrielcalero.playingwithdagger2.di;

import android.content.Context;

import com.gabrielcalero.playingwithdagger2.App;
import com.gabrielcalero.playingwithdagger2.ui.IVisualizer;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {AndroidInjectionModule.class, GlobalModule.class, ActivityBindingModule.class})
public interface AppComponent extends AndroidInjector<App> {

    IVisualizer visualizer();

    @Component.Builder
    interface Builder {
        @BindsInstance Builder context(Context context);
        AppComponent build();
    }

}
