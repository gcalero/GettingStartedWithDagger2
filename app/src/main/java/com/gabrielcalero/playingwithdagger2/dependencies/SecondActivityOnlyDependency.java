package com.gabrielcalero.playingwithdagger2.dependencies;

import android.util.Log;

import com.gabrielcalero.playingwithdagger2.ui.IVisualizer;

import javax.inject.Singleton;

@Singleton
public class SecondActivityOnlyDependency {

    IVisualizer visualizer;
    public SecondActivityOnlyDependency(IVisualizer visualizer) {
        Log.d("DAGGER-2", "Creating a SecondActivityOnlyDependency with visualizer " +  visualizer);
        this.visualizer = visualizer;
    }

    public void doSomething() {
        Log.d("DAGGER-2", "SecondActivityOnlyDependency is doing something ");
        visualizer.doSomething();
    }

}
