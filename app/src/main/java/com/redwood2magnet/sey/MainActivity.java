package com.redwood2magnet.sey;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements myInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Second second=new Second();
        second.myM(this,10,20);
    }

    @Override
    public void getResult(int result) {
        Log.d("TAG",String.valueOf(result));
    }
}
