package com.gabrielcalero.playingwithdagger2.di;

import com.gabrielcalero.playingwithdagger2.ui.IVisualizer;
import com.gabrielcalero.playingwithdagger2.ui.Visualizer;

import java.util.Map;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public abstract class GlobalModule {

    @Provides @IntoMap @Named("positive-numbers-map")@StringKey("One") static Integer provideOne() { return 1; }
    @Provides @IntoMap @Named("positive-numbers-map")@StringKey("Two") static Integer provideTwo() { return 2; }
    @Provides @IntoMap @Named("positive-numbers-map")@StringKey("Three") static Integer provideThree() { return 3; }

    @Provides @IntoMap  @Named("negative-numbers-map") @StringKey("MinusOne") static Integer provideMinusOne() { return -1; }
    @Provides @IntoMap  @Named("negative-numbers-map") @StringKey("MinusTwo") static Integer provideMinusTwo() { return -2; }
    @Provides @IntoMap  @Named("negative-numbers-map") @StringKey("MinusThree") static Integer provideMinusThree() { return -3; }

    @Singleton
    @Binds
    abstract IVisualizer provideVisualizer(Visualizer visualizerClass);


}
