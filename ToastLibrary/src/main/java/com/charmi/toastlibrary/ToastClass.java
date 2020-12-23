package com.charmi.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public  class ToastClass {

    public static void showToast(Context ctx){
        Toast.makeText(ctx, "Hello from toast library...", Toast.LENGTH_LONG).show();

    }
}
