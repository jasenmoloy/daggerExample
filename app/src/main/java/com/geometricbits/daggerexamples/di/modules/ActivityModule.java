package com.geometricbits.daggerexamples.di.modules;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    public Resources providesResources() {
        return activity.getResources();
    }
}
