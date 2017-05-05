package com.example.dell.paomadeng.BroadCastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by DELL on 2017/5/4.
 */
public class MyBroadcastReceiver extends BroadcastReceiver{
    public MyBroadcastReceiver() {
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"received in MyBroadcastReceiver",Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
