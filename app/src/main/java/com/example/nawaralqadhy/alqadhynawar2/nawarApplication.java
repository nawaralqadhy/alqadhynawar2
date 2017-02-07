package com.example.nawaralqadhy.alqadhynawar2;

import android.app.Application;

import com.example.nawaralqadhy.alqadhynawar2.util.UtilLog;

/**
 * Created by nawaralqadhy on 2/6/17.
 */

public class nawarApplication extends Application {

    public void onCreate(){
        super.onCreate();
        UtilLog.setDebug(true);

    }

}
