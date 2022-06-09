package com.example.ui_layout_testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.ui_layout_testing.R;
import com.example.ui_layout_testing.signUp_Login;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int SPLASH_TIME = 2000;
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(getApplicationContext(), signUp_Login.class);
            startActivity(intent);
            finish();
        }, SPLASH_TIME);
    }
}