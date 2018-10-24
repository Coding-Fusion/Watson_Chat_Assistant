package com.example.debrathdev.springas;

/**
 * Created by DEBRATH(DEV) on 2/22/2018.
 */

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class App extends Application {
    //you can leave this empty or override methods if you like so the thing is that you need to extend from MultiDexApplication

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}




