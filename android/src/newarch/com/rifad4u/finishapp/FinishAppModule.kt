package com.rifad4u.finishapp

import com.facebook.react.bridge.ReactApplicationContext

class FinishAppModule(reactContext: ReactApplicationContext) : NativeFinishAppSpec(reactContext) {

    private var delegate: FinishAppImpl = FinishAppImpl()

    override fun getName(): String {
        return FinishAppImpl.NAME
    }

    override fun exitApp(remove: Boolean?) {
        delegate.exitApp(reactApplicationContext, remove)
    }

}
