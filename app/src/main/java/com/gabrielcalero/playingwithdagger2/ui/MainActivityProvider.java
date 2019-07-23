package com.gabrielcalero.playingwithdagger2.ui;

import com.gabrielcalero.playingwithdagger2.Collaborator;
import com.gabrielcalero.playingwithdagger2.Doer;
import com.gabrielcalero.playingwithdagger2.di.IDoer;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public class MainActivityProvider {
    @Provides
    public IDoer provideDoer(Collaborator collaborator) {
        return new Doer(collaborator);
    }

    @Provides @IntoMap @Named("positive-numbers-map") @StringKey("One") Integer provideOne() { return 1; }
    @Provides @IntoMap @Named("positive-numbers-map") @StringKey("Two") Integer provideTwo() { return 2; }
    @Provides @IntoMap @Named("positive-numbers-map") @StringKey("Three") Integer provideThree() { return 3; }

    @Provides @IntoMap @Named("negative-numbers-map") @StringKey("One") Integer provideMinusOne() { return -1; }
    @Provides @IntoMap @Named("negative-numbers-map") @StringKey("Two") Integer provideMinusTwo() { return -2; }
    @Provides @IntoMap @Named("negative-numbers-map") @StringKey("Three") Integer provideMinusThree() { return -3; }

}
