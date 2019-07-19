package com.gabrielcalero.playingwithdagger2.di;

import com.gabrielcalero.playingwithdagger2.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component( modules = { MyModule.class } )
@Singleton
public interface AppComponent {

    void inject (MainActivity mainActivity);
}
