package com.tinytongtong.gradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("defaultNickName:" + BuildConfig.defaultNickName);
        System.out.println("defaultNickName.type:" + BuildConfig.defaultNickName.getClass().getSimpleName());

        System.out.println("defaultNumber:" + BuildConfig.defaultNumber);
        System.out.println("defaultNumber.type:" + BuildConfig.defaultNumber.getClass().getSimpleName());

        //渠道
        String channelName = AppInfoUtils.getAppMetaData(this.getApplicationContext(),"TINY_CHANNEL");
        TextView tvChannel = findViewById(R.id.tv2);
        tvChannel.setText("渠道名称为：" + channelName);
    }
}
