package com.geometricbits.daggerexamples.di;

import android.app.Activity;

import com.geometricbits.daggerexamples.di.annotations.ActivityScope;
import com.geometricbits.daggerexamples.di.modules.ActivityModule;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(
    modules = {
            ActivityModule.class
    }
)
public interface ActivityComponent {
    void inject(Activity activity);
}
