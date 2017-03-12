package com.example.mvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by DELL on 2017/3/12.
 */

public class user extends BaseObservable{//继承BaseObervable用来进入观察者模式
    private String username;
    private String password;
    @Bindable
    public boolean isVisible() {
        return visible;
    }
    @Bindable
    public void setVisible(boolean visible) {
        this.visible = visible;
        notifyPropertyChanged(BR.visible);
    }

    private boolean visible;
    @Bindable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
       notifyPropertyChanged(BR.username);//类似于通知消息，就好比我要给观察我的人发送消息了
        this.username = username;
    }
    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        notifyPropertyChanged(BR.password);
        this.password = password;
    }
}
