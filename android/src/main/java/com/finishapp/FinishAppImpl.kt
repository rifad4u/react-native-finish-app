package com.finishapp

import com.facebook.react.bridge.ReactApplicationContext
import kotlin.system.exitProcess

class FinishAppImpl {

    fun exitApp(reactContext: ReactApplicationContext, remove: Boolean?) {
        if (remove == true) {
            reactContext.currentActivity?.finishAndRemoveTask()
        }
        exitProcess(0)
    }

    companion object {
        const val NAME = "FinishApp"
    }

}
