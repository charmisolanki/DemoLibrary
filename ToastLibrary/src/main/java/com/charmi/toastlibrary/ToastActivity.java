package com.charmi.toastlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    private String client_key = "CHARMI123SOLANKI1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        if(getIntent() != null && getIntent().getExtras() != null){
           demoFunc(getIntent().getExtras().getString("data"));
        } else{
            demoFunc("no data received in intent");

        }
    }


    public void demoFunc(String data){
        Toast.makeText(this ,data, Toast.LENGTH_LONG).show();
    }
}