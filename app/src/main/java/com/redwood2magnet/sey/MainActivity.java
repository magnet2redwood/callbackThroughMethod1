package com.redwood2magnet.sey;

import android.nfc.Tag;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements myInterface {
    TextView resultTxt;
    Second second;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resultTxt=findViewById(R.id.resulttext);
         second= new Second();
        second.getInterface(this);

    }

    public void getsum(View view) {
        thid t=new thid();
        t.m1();
    }

    @Override
    public void getSumResult(int result) {
        resultTxt.setText(String.valueOf(result));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(second!= null){
            second.kucho();
        }

    }
}
