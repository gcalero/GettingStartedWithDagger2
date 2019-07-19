package com.gabrielcalero.playingwithdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gabrielcalero.playingwithdagger2.di.IDoer;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    IDoer doer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((Application) getApplicationContext()).getComponent().inject(this);

        setContentView(R.layout.activity_main);


        doer.doSomething();
    }
}
