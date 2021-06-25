package com.charmi.demolibrary.merchandise.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.charmi.demolibrary.BuildConfig;
import com.charmi.demolibrary.R;

public class MerchandiseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchandise);

        if(BuildConfig.FLAVOR.equals("liquid")) {
            if (getSupportActionBar() != null)
                getSupportActionBar().setTitle("Liquid flavor");
        }
        else if(BuildConfig.FLAVOR.equals("solid")) {
            if (getSupportActionBar() != null)
                getSupportActionBar().setTitle("solid flavor");
        }
    }
}