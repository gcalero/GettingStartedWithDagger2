package com.gabrielcalero.playingwithdagger2.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gabrielcalero.playingwithdagger2.R;
import com.gabrielcalero.playingwithdagger2.di.CristoActivity;
import com.gabrielcalero.playingwithdagger2.di.IDoer;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    IDoer doer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        doer.doSomething();


        startActivity(new Intent(this, CristoActivity.class));
    }
}
