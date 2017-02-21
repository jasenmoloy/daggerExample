package com.geometricbits.daggerexamples;

import android.app.Application;

import com.geometricbits.daggerexamples.di.AppModule;
import com.geometricbits.daggerexamples.di.ApplicationComponent;
import com.geometricbits.daggerexamples.di.DaggerApplicationComponent;

public class ExampleApplication extends Application {

    private static ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .appModule(new AppModule(this))
                .build();
        component.inject(this);

    }

    public static ApplicationComponent component() {
        return component;
    }
}
