package com.example.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        final user user = new user();
        user.setUsername("kentanvictor");
        user.setPassword("123456");
        mBinding.setUser(user);
        user.setVisible(false);
        Button button = (Button) findViewById(R.id.but1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(MainActivity.this,user.getUsername()+""+user.getPassword(),Toast.LENGTH_SHORT).show();
                user.setUsername(user.getUsername()+"-debug");*/
                user.setVisible(!user.isVisible());
            }
        });
    }
}
