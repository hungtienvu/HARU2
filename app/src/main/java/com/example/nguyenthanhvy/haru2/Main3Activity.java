package com.example.nguyenthanhvy.haru2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    public String bt_name;
    SharedPreferences sharedPref;
    EditText textBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        sharedPref = this.getPreferences(Context.MODE_PRIVATE);

        Intent intent = getIntent();
        if(intent.hasExtra("button_name"));
            bt_name = intent.getStringExtra("button_name");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Inflate
        LayoutInflater inflater = this.getLayoutInflater();
        View buttonsView = inflater.inflate(R.layout.activity_main2, null);

        int resID = getResources().getIdentifier(bt_name, "id", getPackageName());


        Button bt = (Button) buttonsView.findViewById(resID);

        TextView texttitle = (TextView) findViewById(R.id.textTitle) ;

        texttitle.setText(bt.getText().toString());
        //get text
        textBox = (EditText) findViewById(R.id.textBox);

        String highScore = sharedPref.getString(bt_name,"N/A");

        textBox.setText(highScore);

    }

    public void saveBt(View v){


        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString(bt_name, textBox.getText().toString());

        editor.apply();

    }
}
