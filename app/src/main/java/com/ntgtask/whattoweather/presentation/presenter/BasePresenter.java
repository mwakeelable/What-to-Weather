package com.ntgtask.whattoweather.presentation.presenter;

import com.ntgtask.whattoweather.data.repository.sharedPreferences.SharedPrefsRepository;
import com.ntgtask.whattoweather.domain.interactors.BaseUseCase;
import com.ntgtask.whattoweather.domain.executors.BusProvider;
import com.ntgtask.whattoweather.domain.interactors.PreferencesUseCase;

public abstract class BasePresenter {
    private PreferencesUseCase prefsUseCase;

    public BasePresenter() {
        prefsUseCase = new PreferencesUseCase(SharedPrefsRepository.getInstance());
    }

    // Helps at tests to mock the use case invocation
    public void executeUseCase(BaseUseCase useCase) {
        useCase.execute();
    }

    // =================== PREFERENCES ======================
    // That how you can get a string from the preferences
    public void storeSharedPreferences(String key, boolean value) {
        prefsUseCase.savePref(key, value);
    }

    // That how you can get a boolean from the preferences
    public boolean getSharedPreferencesBoolean(String key) {
        return prefsUseCase.getBooleanPref(key);
    }

    // =================== SUBSCRIBERS ======================

    /*
        Need these methods to register and unregister the presenters in order
        to listen to events that happen on the UI Bus
     */
    public void register() {
        try {
            BusProvider.getUIBusInstance().register(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void unregister() {
        try {
            BusProvider.getUIBusInstance().unregister(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
