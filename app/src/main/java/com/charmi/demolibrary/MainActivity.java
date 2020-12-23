package com.charmi.demolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast();
    }

    public void showToast(){
        Toast.makeText(this, "Hello from toast library...", Toast.LENGTH_LONG).show();

    }
}