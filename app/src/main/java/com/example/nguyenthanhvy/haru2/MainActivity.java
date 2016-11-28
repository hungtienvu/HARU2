package com.example.nguyenthanhvy.haru2;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);

        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
                setContentView(R.layout.activity_main);
            }

            public void onFinish() {
                Intent intent  = new Intent(context, Main2Activity.class);
                startActivity(intent);
            }
        }.start();


    }



}
