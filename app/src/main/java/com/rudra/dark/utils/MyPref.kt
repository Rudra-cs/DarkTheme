package com.rudra.dark.utils

import android.content.Context
import androidx.preference.PreferenceManager

class MyPref(context: Context?) {

    companion object {
        private const val DARK_STATUS = "Dark Theme"
    }

    private val preferences = PreferenceManager.getDefaultSharedPreferences(context)

    var darkMode = preferences.getInt(DARK_STATUS, 0)
        set(value) = preferences.edit().putInt(DARK_STATUS, value).apply()

}