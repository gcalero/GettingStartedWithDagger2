package com.gabrielcalero.playingwithdagger2.ui;

import android.util.Log;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

public class Visualizer implements IVisualizer {

    private String TAG = Visualizer.class.getSimpleName();

    @Inject
    @Named("negative-numbers-map")
    public Map<String, Integer> numbersMap;

    @Inject
    public Visualizer() {
        Log.d("DAGGER-2", "Creating a Visualizer (" + this + ")");
    }

    @Override
    public void doSomething() {
        Log.d(TAG, "Visualizing...");
        for (Map.Entry<String, Integer> e: numbersMap.entrySet()) {
            Log.d("DAGGER-2", "Visualizing: " + e.getKey() +  ", " + e.getValue());
        }
    }
}
