package com.gabrielcalero.playingwithdagger2.di;

import android.content.Context;
import android.util.Log;

import com.gabrielcalero.playingwithdagger2.ui.IVisualizer;
import com.gabrielcalero.playingwithdagger2.ui.Visualizer;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class CristoProvider {

    @Provides @Named("misc") String pepe() { return "Hello named"; }

    @Provides
    IVisualizer provideVisualizer(Context context, @Named("misc") String miscelaneous) {
        Log.d("DAGGER-2", "Injecting with context " + context + " misc: " + miscelaneous);
        return new Visualizer();
    }
}
