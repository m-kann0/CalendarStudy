package com.kann0.calendarstudy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class CalendarChangeReceiver extends BroadcastReceiver {

    private static final String TAG = "CalendarChangeReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: CALENDAR CHANGED!!");
    }
}
