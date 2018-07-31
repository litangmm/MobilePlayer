package com.jekmao.mobileplayer.base;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;

/**
 * MaoJiaMin
 * 2018/7/31 16:33
 * Function: 主页面
 */
public abstract class BasePager {

    public final Context context;

    public View rootview;

    public BasePager(Context context){
        this.context = context;
        rootview = initView();
    }

    public abstract View initView();

    public void initData(){

    }
}


