package com.gabrielcalero.playingwithdagger2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.gabrielcalero.playingwithdagger2.mainactivity.IDoer;
import com.gabrielcalero.playingwithdagger2.secondactivity.SecondActivity;
import com.gabrielcalero.playingwithdagger2.ui.IVisualizer;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    IDoer doer;
    @Inject
    IVisualizer visualizer;

    @Inject @Named("positive-numbers-map")
    Map<String, Integer> positiveNumbersMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.startSecondActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
        doer.doSomething();

        for (Map.Entry<String, Integer> e: positiveNumbersMap.entrySet()) {
            Log.d("DAGGER-2", "Map component: " + e.getKey() +  ", " + e.getValue());
        }

        visualizer.doSomething();

    }
}
