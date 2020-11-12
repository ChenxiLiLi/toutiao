package com.bytedance.toutiao;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.bytedance.toutiao.bean.User;
import com.bytedance.toutiao.utils.AppUtils;

/**
 * Data : 2020/10/29
 * Time : 16:19
 * Author : 刘朝阳
 */
public class MyApplication extends Application {
    private static MyApplication context;
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //捕获崩溃日志，位置在外部存储的LianSou
//        CrashHandler crashHandler = CrashHandler.getInstance();
//        crashHandler.init(getApplicationContext());
        context = this;
        AppUtils.initContext(this);


    }


    public static Context getContext() {
        return context;
    }
}
