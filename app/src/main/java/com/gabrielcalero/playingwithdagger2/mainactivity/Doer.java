package com.gabrielcalero.playingwithdagger2.mainactivity;

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
