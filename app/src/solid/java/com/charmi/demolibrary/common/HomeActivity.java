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
            getSupportActionBar().setTitle("Solid variant");

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MerchandiseActivity.class));

            }
        });
    }
}