package com.ntgtask.whattoweather.presentation.components;

import android.app.Application;

public class AppController extends Application {
    private static AppController INSTANCE;

    public static AppController getInstance() {
        if (INSTANCE == null) {
            throw new IllegalStateException("Application is not created yet");
        }
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }
}
