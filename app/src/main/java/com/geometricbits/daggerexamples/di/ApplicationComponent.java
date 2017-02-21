package com.geometricbits.daggerexamples.di;


import android.content.res.Resources;

import com.geometricbits.daggerexamples.ExampleApplication;
import com.geometricbits.daggerexamples.di.modules.ActivityModule;
import com.geometricbits.daggerexamples.di.modules.AppModule;

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

    ActivityComponent plus(ActivityModule module);
}
