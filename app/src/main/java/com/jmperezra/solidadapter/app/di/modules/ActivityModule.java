package com.jmperezra.solidadapter.app.di.modules;


import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    protected final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    public Activity provideActivity() {
        return this.activity;
    }
}
