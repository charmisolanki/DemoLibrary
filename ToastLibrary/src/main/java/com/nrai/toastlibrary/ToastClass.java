package com.nrai.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastClass {

    public void showToast(Context context){
        Toast.makeText(context, "Hello from toast library...", Toast.LENGTH_LONG).show();

    }
}
