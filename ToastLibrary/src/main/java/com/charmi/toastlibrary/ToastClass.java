package com.charmi.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastClass {

    private String client_key = "CHARMI123SOLANKI1234";

    public void showToast(Context ctx){
        Toast.makeText(ctx, "Hello from toast library...", Toast.LENGTH_LONG).show();

        demoFunc(client_key);
    }

    public void demoFunc(String key){

    }
}
