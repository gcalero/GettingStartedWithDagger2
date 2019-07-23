package com.gabrielcalero.playingwithdagger2;

import com.gabrielcalero.playingwithdagger2.di.IDoer;

import javax.inject.Inject;

public class Doer implements IDoer {

    private final Collaborator mCollaborator;

    public Doer(Collaborator collaborator) {
        mCollaborator = collaborator;
    }

    @Override
    public void doSomething() {
        mCollaborator.doSomethingElse();
    }
}
