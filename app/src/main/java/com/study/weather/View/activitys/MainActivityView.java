package com.study.weather.View.activitys;

import com.study.weather.Data.SimpleWeather;
import com.study.weather.View.BaseView.MvpView;

/**
 * Created by android on 17-10-25.
 */


//抽象
//Presenter需要依赖的就是这个抽象

public interface MainActivityView extends MvpView {
    void updateSimpleWeatherDatas(SimpleWeather simpleWeather);

    void addCityPage(String cityName);

    void subtractCityPage(int position);
}
