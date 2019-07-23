package com.gabrielcalero.playingwithdagger2;

import android.app.Application;
import android.util.Log;

import com.gabrielcalero.playingwithdagger2.di.AppComponent;
import com.gabrielcalero.playingwithdagger2.di.DaggerAppComponent;

import java.util.Map;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class App extends Application implements HasAndroidInjector {

    @Inject
    DispatchingAndroidInjector<Object> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        AppComponent component = DaggerAppComponent.builder().context(getApplicationContext()).build();
        component.inject(this);
        //Log.d("DAGGER-2", "App component has this visualizer: " + component.visualizer());
    }

    @Override
    public AndroidInjector<Object> androidInjector() {
        return dispatchingAndroidInjector;
    }
}
