package com.example.nguyenthanhvy.haru2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main2Activity extends AppCompatActivity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //vars
        Typeface font = Typeface.createFromAsset(getAssets(), "AmaticSC-Bold.ttf");

        TextView day = (TextView) findViewById(R.id.day);
        TextView wkd = (TextView) findViewById(R.id.wkd);
        TextView m_and_y = (TextView) findViewById(R.id.m_and_y);
        //buttons
        Button bt1 = (Button) findViewById(R.id.shit);
        Button bt2 = (Button) findViewById(R.id.spend);
        Button bt3 = (Button) findViewById(R.id.getdone);
        Button bt4 = (Button) findViewById(R.id.feel);
        Button bt5 = (Button) findViewById(R.id.grateful);
        Button bt6 = (Button) findViewById(R.id.family);
        Button bt7 = (Button) findViewById(R.id.plans);
        Button bt8 = (Button) findViewById(R.id.better);


        //open textare


        day.setTypeface(font);
        day.setTextSize(40);
        wkd.setTypeface(font);
        m_and_y.setTypeface(font);

        Date now = new Date();
        // EEE gives short day names, EEEE would be full length.
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("EEEE");
        String wkd_str = sdf.format(now);
        sdf.applyPattern("d");
        String day_str = sdf.format(now);

        sdf.applyPattern("MMM yyyy");
        String m_and_y_str = sdf.format(now);

        day.setText(day_str);
        wkd.setText(wkd_str);
        m_and_y.setText(m_and_y_str);

    }

    public void openTextArea(View v){
        Intent intent = new Intent(context,Main3Activity.class);
        String viewid = v.getResources().getResourceEntryName(v.getId());

        intent.putExtra("button_name", viewid);
        startActivity(intent);
    }
}
