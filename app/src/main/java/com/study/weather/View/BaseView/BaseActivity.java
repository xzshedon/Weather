package com.study.weather.View.BaseView;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by android on 17-10-20.
 *
 * 后续创建的Activity都需要继承这个BaseActivity，这样便于以后植入统一的操作。
 * 不然以后需要统一给Activity进行相同操作时，就要一个个去改！
 */


// 之所以写成抽象，是为了规范约束，提醒你下面几个方法是必要的

public abstract  class BaseActivity extends AppCompatActivity{

    //  初始化数据请求
    abstract protected void initData();

    //  初始化View
    abstract protected void initView();

    //  给View添加监听器
    abstract  protected void addListener();

}
