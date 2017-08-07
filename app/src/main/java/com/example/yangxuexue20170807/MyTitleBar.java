package com.example.yangxuexue20170807;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 类描述：
 * Created by 杨雪雪 on 2017/8/7.
 */

public class MyTitleBar extends LinearLayout {
    private Button button1, button2;
    private TextView text;
    public onClicklistenerBar listener;

    public void setListener(onClicklistenerBar listener) {
        this.listener = listener;
    }

    public MyTitleBar(Context context) {
        super(context);
        init(null);
    }

    public MyTitleBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    private void init(AttributeSet attrs) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.mytitlebar, this);
        button1 = v.findViewById(R.id.button1);
        button2 = v.findViewById(R.id.button2);
        text = v.findViewById(R.id.textview);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    listener.onbutton1listener(view);
                }
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    listener.onbutton2listener(view);
                }
            }
        });
        //attrs判空
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.MyTitleBar);
            String ztnarong = a.getString(R.styleable.MyTitleBar_ZTnarong);
            text.setText(ztnarong);
            int ztcolor = a.getColor(R.styleable.MyTitleBar_ZTcolor, Color.BLACK);
            text.setTextColor(ztcolor);
            int ztsize = a.getInteger(R.styleable.MyTitleBar_ZTsize, 25);
            text.setTextSize(ztsize);
            int ztbackcolor = a.getColor(R.styleable.MyTitleBar_ZTbackcolor, Color.DKGRAY);
            text.setBackgroundColor(ztbackcolor);

            String zwznarong = a.getString(R.styleable.MyTitleBar_zwznarong);
            button1.setText(zwznarong);
            int zwzcolor = a.getColor(R.styleable.MyTitleBar_zwzcolor, Color.WHITE);
            button1.setTextColor(zwzcolor);
            int zwzsize = a.getInteger(R.styleable.MyTitleBar_zwzsize, 23);
            button1.setTextSize(zwzsize);
            int zwzbackcolor = a.getColor(R.styleable.MyTitleBar_zwzbackcolor, Color.BLUE);
            button1.setBackgroundColor(zwzbackcolor);

            String ywznarong = a.getString(R.styleable.MyTitleBar_ywznarong);
            button2.setText(ywznarong);
            int ywzcolor = a.getColor(R.styleable.MyTitleBar_ywzcolor, Color.WHITE);
            button2.setTextColor(ywzcolor);
            int ywzsize = a.getInteger(R.styleable.MyTitleBar_ywzsize, 23);
            button2.setTextSize(ywzsize);
            int ywzbackcolor = a.getColor(R.styleable.MyTitleBar_ywzbackcolor, Color.BLUE);
            button2.setBackgroundColor(ywzbackcolor);
            a.recycle();///销毁
        }
    }


    public interface onClicklistenerBar {
        public void onbutton1listener(View v);

        public void onbutton2listener(View v);

    }
}
