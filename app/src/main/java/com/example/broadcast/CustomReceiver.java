package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // tipe event yang terjadi (menerima banyak event)
        String intentAction = intent.getAction();
        if (intentAction != null) {
            String toastMessage = "unknown";
            switch (intentAction) {
                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "Power Connected";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "Power Disconnected";
                    break;
            }
            Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
        }
    }
}