package com.gabrielcalero.playingwithdagger2.secondactivity;

import com.gabrielcalero.playingwithdagger2.dependencies.SecondActivityOnlyDependency;
import com.gabrielcalero.playingwithdagger2.di.ActivityScoped;
import com.gabrielcalero.playingwithdagger2.ui.IVisualizer;

import dagger.Module;
import dagger.Provides;

@Module
public class SecondActivityModule {

    @ActivityScoped
    @Provides
    public static SecondActivityOnlyDependency provideSecondActivityDependency(IVisualizer visualizer) {
        return new SecondActivityOnlyDependency(visualizer);
    }
}
