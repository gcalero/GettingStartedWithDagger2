package com.gabrielcalero.playingwithdagger2.ui;

import android.util.Log;

import javax.inject.Inject;

public class Visualizer implements IVisualizer {

    private String TAG = Visualizer.class.getSimpleName();

    @Inject
    public Visualizer() {
    }

    @Override
    public void doSomething() {
        Log.d(TAG, "Visualizing...");
    }
}
