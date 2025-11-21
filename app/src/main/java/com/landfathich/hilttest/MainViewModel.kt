package com.landfathich.hilttest

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
    class MainViewModel @Inject constructor(
    val wiFiManager: WiFiManager
): ViewModel() {

    init {
        Log.d("TEST", "MainViewModel instance id: $wiFiManager")
    }

    fun connect() {
        wiFiManager.connect()
    }
}