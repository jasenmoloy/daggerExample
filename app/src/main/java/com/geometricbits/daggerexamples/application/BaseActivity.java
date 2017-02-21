package com.geometricbits.daggerexamples.application;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public abstract class BaseActivity extends AppCompatActivity {

    @Inject Resources resources;

    @Override
    public Resources getResources() {
        return resources == null ? super.getResources() : resources;
    }
}
