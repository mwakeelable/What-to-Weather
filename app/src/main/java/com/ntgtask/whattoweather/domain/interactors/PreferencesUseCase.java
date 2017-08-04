package com.ntgtask.whattoweather.domain.interactors;

import com.ntgtask.whattoweather.domain.repository.PreferencesDataSource;

import java.util.ArrayList;

public class PreferencesUseCase {
    private final PreferencesDataSource dataSource;
    /**
     * The creator of this use case
     * @param dataSource The implementor of the request. (In this case the implementor will always
     *                   be the SharedPrefsRepository)
     */
    public PreferencesUseCase(PreferencesDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /*
        All the methods below support some of the most common operations when we store key - value
        preferences in a data source.
     */

    public int getIntPref(String key) {
        return dataSource.getIntFromPreferences(key);
    }

    public String getStringPref(String key) {
        return dataSource.getStringFromPreferences(key);
    }

    public boolean getBooleanPref(String key) {
        return dataSource.getBooleanFromPreferences(key);
    }

    public float getFloatPref(String key) {
        return dataSource.getFloatFromPreferences(key);
    }

    public long getLongPref(String key) {
        return dataSource.getLongFromPreferences(key);
    }

    public ArrayList<String> getStringList(String key) {
        return dataSource.getStringListFromPreferences(key);
    }

    public void savePref(String key, String value) {
        dataSource.writeToPreferences(key, value);
    }

    public void savePref(String key, long value) {
        dataSource.writeToPreferences(key, value);
    }

    public void savePref(String key, float value) {
        dataSource.writeToPreferences(key, value);
    }

    public void savePref(String key, boolean value) {
        dataSource.writeToPreferences(key, value);
    }

    public void savePref(String key, int value) {
        dataSource.writeToPreferences(key, value);
    }

    public void savePref(String key, ArrayList<String> value) {
        dataSource.writeToPreferences(key, value);
    }

    public void clearSingle(String key) {
        dataSource.clear(key);
    }

    public void clearAll() {
        dataSource.clearAll();
    }
}
