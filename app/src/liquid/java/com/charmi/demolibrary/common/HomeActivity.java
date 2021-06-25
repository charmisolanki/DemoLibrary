package com.charmi.demolibrary.common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.charmi.demolibrary.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if (getSupportActionBar() != null)
        getSupportActionBar().setTitle("Liquid variant");
    }
}