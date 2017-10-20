package com.study.weather;

import android.app.Application;
import android.content.Context;

import com.study.weather.Data.Cache.Config;
import com.study.weather.Utils.CrashHandler;

/**
 * Created by android on 17-10-19.
 */

public class ChiceApplication extends Application {

    private static Context context;

    @Override
    public void onCreate(){
        super.onCreate();
        context = this;
        //  初始化异常处理类
//        CrashHandler.getInstance().init(context);
//        Config.init(context);
    }

    //  获取系统级Context
    public static Context getAppContext(){
        return context;
    }

}
