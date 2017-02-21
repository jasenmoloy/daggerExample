package com.geometricbits.daggerexamples;

import android.app.Activity;
import android.app.Application;

import com.geometricbits.daggerexamples.di.ActivityComponent;
import com.geometricbits.daggerexamples.di.modules.ActivityModule;
import com.geometricbits.daggerexamples.di.modules.AppModule;
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

    public static ActivityComponent getActivityComponent(Activity activity) {
        return component.plus(new ActivityModule(activity));
    }

    public static ApplicationComponent component() {
        return component;
    }
}
