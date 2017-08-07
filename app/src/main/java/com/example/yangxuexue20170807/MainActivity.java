package com.example.yangxuexue20170807;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyTitleBar.onClicklistenerBar{
private  MyTitleBar title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       title= (MyTitleBar) findViewById(R.id.mytitlebar);
      title.setListener(this);




    }

    @Override
    public void onbutton1listener(View v) {
        Toast.makeText(this,"点击返回",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onbutton2listener(View v) {
        Toast.makeText(this,"点击更多",Toast.LENGTH_LONG).show();
    }
}
