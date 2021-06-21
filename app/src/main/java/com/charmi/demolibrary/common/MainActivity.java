package com.charmi.demolibrary.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.charmi.demolibrary.BuildConfig;
import com.charmi.demolibrary.R;

public class MainActivity extends AppCompatActivity {

    TextView tvShowCustId;
    private String cust_id = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShowCustId = findViewById(R.id.tvShowCustId);

        if (getIntent() != null)
            cust_id = getIntent().getBundleExtra("cust_id").toString();

        tvShowCustId.setText(BuildConfig.CUSTOMER_ID + " new cust_id= " + cust_id);

    }


}