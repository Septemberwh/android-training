package com.example.septe.myapplication.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class TestService1 extends Service {

    private final String TAG = "TestService1";

    public TestService1() {
    }

    //必须要实现的方法
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "onBind方法被调用");
        return null;
    }

    //Service被创建时调用
    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate方法被调用");
        super.onCreate();
    }

    // Service启动时调动
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStartCommand方法被调用");
        return super.onStartCommand(intent, flags, startId);
    }

    // Service被关闭之前调用
    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy方法被调用");
        super.onDestroy();
    }

}
