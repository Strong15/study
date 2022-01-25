package com.mine.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private TextView textview;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button = (Button) findViewById(R.id.button1);
//        button.setOnClickListener(this);
    }

    //这里写退出逻辑
    public void openWorkWechat(View view) {
        openWeChat();
        Toast.makeText(this,"切换到企业微信",Toast.LENGTH_SHORT).show();

        Intent intent = getPackageManager().getLaunchIntentForPackage("com.tencent.wework");
        if (intent != null) {
            intent.putExtra("type", "110");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        openWeChat();

    }
    public void openWeChat(){
        Toast.makeText(this,"切换到微信",Toast.LENGTH_SHORT).show();

        Intent intent = getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
        if (intent != null) {
            intent.putExtra("type", "110");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
        try {
            Thread.currentThread();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }


}