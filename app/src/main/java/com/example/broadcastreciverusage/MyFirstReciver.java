package com.example.broadcastreciverusage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyFirstReciver extends BroadcastReceiver {

    private static final String TAG = MyFirstReciver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG,"Hello from first receiver!");
        Toast.makeText(context, "Hello from first receiver!", Toast.LENGTH_LONG).show();
    }


}
