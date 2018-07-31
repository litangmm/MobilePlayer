package com.jekmao.mobileplayer.pager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.jekmao.mobileplayer.base.BasePager;


/**
 * MaoJiaMin
 * 2018/7/31 16:43
 * Function:
 */
public class NetVideoPager extends BasePager {
    private TextView textView;

    public NetVideoPager(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        textView = new TextView(context);
        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        return textView;
    }

    public void initData(){
        super.initData();
        textView.setText("网络视频");
    }
}


