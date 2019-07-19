package com.gabrielcalero.playingwithdagger2;

import com.gabrielcalero.playingwithdagger2.di.IDoer;

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
