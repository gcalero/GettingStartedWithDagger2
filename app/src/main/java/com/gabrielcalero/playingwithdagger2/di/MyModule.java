package com.gabrielcalero.playingwithdagger2.di;

import com.gabrielcalero.playingwithdagger2.Collaborator;
import com.gabrielcalero.playingwithdagger2.Doer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    @Provides
    @Singleton
    public IDoer provideADoer(Collaborator collaborator) {
        return new Doer(collaborator);
    }

    @Provides
    @Singleton
    public Collaborator provideCollaborator() {
        return new Collaborator();
    }
}
