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
        abortBroadcast();//abrtBroadcast()想要截断对后面的广播接收器的接收一定要设置第一条发出的广播的优先级高于后面的优先级，不然无法截断
    }
}
