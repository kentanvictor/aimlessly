/*
这相当于重载了TextView的控件，这样就使得TextView中的isFocused的方法得到了重载
      android:focusable="true"
      android:focusableInTouchMode="true"
这就使得这两个android的方法得以实现，使得isFocused方法让两个都可以得到Focus
如果没有重载isFocused这个方法，那么第一个TextView就已经得到了Focus，那么之后的TextView就得不到焦点
重载过后，强制所有的TextView都得到了Focus，所以之后的TextView都可以进行跑马灯的效果
* */
package com.example.dell.paomadeng;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by DELL on 2017/1/24.
 */

public class Text extends TextView{

    public Text(Context context) {
        super(context);
    }
    public Text(Context context , AttributeSet attrs ,int defStyle){
        super(context, attrs,defStyle);
    }
    public Text (Context context ,AttributeSet attrs){
        super(context,attrs);
    }
    @Override
    public boolean isFocused(){
        return true;
    }
    /*
    return TRUE if this view has focus
    isFocused表示的是当前的view是否是被选中的
    运用return true 表示的是强制让这两个TextView 都被选中
    那么这样就会出现两个都变成跑马灯的形式
    * */
}
