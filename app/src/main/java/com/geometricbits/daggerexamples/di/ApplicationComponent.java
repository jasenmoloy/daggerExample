package com.geometricbits.daggerexamples.di;


import android.content.res.Resources;

import com.geometricbits.daggerexamples.ExampleApplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
    modules = {
        AppModule.class
    }
)
public interface ApplicationComponent {
    void inject(ExampleApplication application);

    ExampleApplication app();
    Resources resources();
}
