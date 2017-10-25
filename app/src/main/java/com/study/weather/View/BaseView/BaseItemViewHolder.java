package com.study.weather.View.BaseView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by android on 17-10-25.
 */

public class BaseItemViewHolder extends RecyclerView.ViewHolder {
    public BaseItemViewHolder(View itemView) {
        super(itemView);
    }
}

    //看看RecyclerView的Adapter现在的变化
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return new BaseItemViewHolder(new NavigatorItemView(context)); //一句话创建
//    }


