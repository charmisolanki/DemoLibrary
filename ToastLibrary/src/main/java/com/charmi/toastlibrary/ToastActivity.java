package com.charmi.toastlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import static com.charmi.toastlibrary.BuildConfig.CUSTOMER_ID;

public class ToastActivity extends AppCompatActivity {

    private String toast_data = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);


        if(getIntent() != null && getIntent().getExtras() != null){
            Bundle bundle = getIntent().getBundleExtra("my_bundle");
            toast_data = bundle.getString("data");
            demoFunc(toast_data);
        } else{
            demoFunc("no data received in intent");

        }
    }


    public void demoFunc(String data){
        Toast.makeText(this ,data +"new cust_id= " + CUSTOMER_ID, Toast.LENGTH_LONG).show();
    }
}