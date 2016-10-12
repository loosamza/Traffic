package com.example.scontz.traffic;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowResult extends AppCompatActivity {
    //Explicit
    private ImageView icon;
    private TextView title, showDetailTextView;
    int clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

        //Blind Widget
        blindWidget();

        //Show Widget
        showWidget();


    }//Oncreate

    private void showWidget() {
        //Data
        final MyData objMyData = new MyData();
        final int[] intIcon = objMyData.icon();
        final String[] strTitle = objMyData.title();

        //Intent
        Intent intent = getIntent();
        clicked = intent.getIntExtra("click", -1);

        //Resource
        Resources res = getResources();
        String[] text = res.getStringArray(R.array.traffic_detail);


        title.setText(strTitle[clicked]);
        icon.setImageResource(intIcon[clicked]);
        showDetailTextView.setText(text[clicked]);
    }//Method Show

    private void blindWidget() {
        //SetDisplay
        title = (TextView) findViewById(R.id.showtitle);
        icon = (ImageView) findViewById(R.id.showicon);
        showDetailTextView = (TextView) findViewById(R.id.detail);


    }//Method Blind


}// Main Class
