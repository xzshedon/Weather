package com.study.weather.View.BaseView;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by android on 17-10-20.
 */

public abstract class BaseFragment extends Fragment{

    abstract protected void initData();

    abstract protected void initView();

    abstract protected void addListener();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        view.setClickable(true);  //    让Fragment最底层的View拦截事件，防止扯到蛋的点透
    }
}
