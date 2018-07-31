package com.jekmao.mobileplayer.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.jekmao.mobileplayer.R;

/**
 * MaoJiaMin
 * 2018/7/31 12:09
 * Function: 主页面
 */
public class MainActivity extends Activity{

    private FrameLayout fl_main_content;
    private RadioGroup rg_button_tag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fl_main_content = (FrameLayout) findViewById(R.id.fl_main_content);
        rg_button_tag = (RadioGroup) findViewById(R.id.rg_button_tag);

        rg_button_tag.check(R.id.rb_video);

    }
}


