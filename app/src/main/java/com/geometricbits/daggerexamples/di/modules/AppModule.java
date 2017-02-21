package com.geometricbits.daggerexamples.di.modules;


import android.content.res.Resources;

import com.geometricbits.daggerexamples.ExampleApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    protected ExampleApplication application;

    public AppModule(ExampleApplication application) {
        this.application = application;
    }

    @Provides @Singleton
    ExampleApplication provideApplication() {
        return application;
    }

    @Provides @Singleton
    Resources provideResources() {
        return application.getResources();
    }
}
