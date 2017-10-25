package com.study.weather.View.BaseView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import butterknife.ButterKnife;

/**
 * Created by android on 17-10-25.
 */

public abstract class BaseRelativeLayout extends RelativeLayout{
    public BaseRelativeLayout(Context context){
        this(context,null);
    }

    public BaseRelativeLayout(Context context, AttributeSet attrs){
        this(context,attrs,0);
    }

    public BaseRelativeLayout(Context context,AttributeSet attrs,int defStyleAttr){
        super(context, attrs, defStyleAttr);
        bindView();
    }

    protected void bindView(){
        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(getLayout(),this,true);
        ButterKnife.bind(this);
    };

    abstract protected int getLayout();
}
