package com.assignment.androidtask;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;


public class App extends MultiDexApplication {



    private static RequestQueue volleyQueue;
    private static Context appContext;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
        volleyQueue = Volley.newRequestQueue(getApplicationContext());
    }

    public static RequestQueue getVolleyQueue() {
        if (volleyQueue == null) {
            volleyQueue = Volley.newRequestQueue(getAppContext());
        }
        return volleyQueue;
    }

    public static Context getAppContext() {
        return appContext;
    }

}
