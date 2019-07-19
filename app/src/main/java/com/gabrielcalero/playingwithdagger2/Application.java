package com.gabrielcalero.playingwithdagger2;

import com.gabrielcalero.playingwithdagger2.di.AppComponent;
import com.gabrielcalero.playingwithdagger2.di.DaggerAppComponent;

public class Application extends android.app.Application {

    private static AppComponent component;

    public static AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = buildComponent();
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder().build();
    }
}
