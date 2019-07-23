package com.gabrielcalero.playingwithdagger2.mainactivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
    @Provides
    public IDoer provideDoer(Collaborator collaborator) {
        return new Doer(collaborator);
    }



}
