package com.tinytongtong.gradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("defaultNickName:" + BuildConfig.defaultNickName);
        System.out.println("defaultNickName.type:" + BuildConfig.defaultNickName.getClass().getSimpleName());

        System.out.println("defaultNumber:" + BuildConfig.defaultNumber);
        System.out.println("defaultNumber.type:" + BuildConfig.defaultNumber.getClass().getSimpleName());
    }
}
