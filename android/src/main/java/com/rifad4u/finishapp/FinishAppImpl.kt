package com.rifad4u.finishapp

import com.facebook.react.bridge.ReactApplicationContext

class FinishAppImpl {

    fun exitApp(reactContext: ReactApplicationContext, remove: Boolean?) {
        if (remove == true) {
            reactContext.currentActivity?.finishAndRemoveTask()
        } else {
            reactContext.currentActivity?.finishAffinity()
        }
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    companion object {
        const val NAME = "FinishApp"
    }

}
