package com.ntgtask.whattoweather.domain.repository;

import java.util.ArrayList;

public interface PreferencesDataSource {
    int getIntFromPreferences(String key);

    String getStringFromPreferences(String key);

    boolean getBooleanFromPreferences(String key);

    float getFloatFromPreferences(String key);

    long getLongFromPreferences(String key);

    ArrayList<String> getStringListFromPreferences(String key);

    void writeToPreferences(String key, int value);

    void writeToPreferences(String key, String value);

    void writeToPreferences(String key, boolean value);

    void writeToPreferences(String key, float value);

    void writeToPreferences(String key, long value);

    void writeToPreferences(String key, ArrayList<String> value);

    void clearAll();

    void clear(String key);
}
