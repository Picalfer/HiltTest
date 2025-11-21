package com.landfathich.hilttest

import android.util.Log

class WiFiManager(private val settings: WiFiSettings) {
    fun connect() {
        settings.openConnection()
    }

    fun sendMessage() {
        settings.writeBytes()
    }
}

class WiFiSettings {
    fun openConnection() {
        Log.d("TEST", "connected")
    }

    fun writeBytes() {
        Log.d("TEST", "message sent")
    }
}