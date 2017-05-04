package com.example.dell.paomadeng.BroadCastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BootCompleteReceiver extends BroadcastReceiver {//广播接收器
    public BootCompleteReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context,"Boot Complete",Toast.LENGTH_SHORT).show();//目前只是简单的使用Toast提示一段文本信息
        /*throw new UnsupportedOperationException("Not yet implemented");*/
    }
}
