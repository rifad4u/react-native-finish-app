package com.finishapp

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class FinishAppModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    private var delegate: FinishAppImpl = FinishAppImpl()

    override fun getName(): String {
        return FinishAppImpl.NAME
    }

    @ReactMethod
    fun exitApp(remove: Boolean?) {
        delegate.exitApp(reactApplicationContext, remove)
    }

}
