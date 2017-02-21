package com.geometricbits.daggerexamples.application;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.geometricbits.daggerexamples.ExampleApplication;

import javax.inject.Inject;

public abstract class BaseActivity extends AppCompatActivity {

    @Inject Resources resources;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ExampleApplication.getActivityComponent(this).inject(this);
    }

    @Override
    public Resources getResources() {
        return resources == null ? super.getResources() : resources;
    }
}
