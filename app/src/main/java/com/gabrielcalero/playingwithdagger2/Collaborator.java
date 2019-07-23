package com.gabrielcalero.playingwithdagger2;

import android.util.Log;

import javax.inject.Inject;

public class Collaborator {

    @Inject
    public Collaborator() {}

    public void doSomethingElse() {
        Log.d("DOING", "I'm doing something");
    }
}
