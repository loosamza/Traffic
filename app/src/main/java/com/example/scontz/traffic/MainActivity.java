package com.example.scontz.traffic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView;
        Button button;
        textView = (TextView) findViewById(R.id.textView);

        createListView();
    }// Main method

    private void createListView() {
        final MyData objMyData = new MyData();
        final int[] intIcon = objMyData.icon();
        final String[] strTitle = objMyData.title();

        final Myadapter objMyadapter = new Myadapter(MainActivity.this, intIcon, strTitle);
        ListView myListView = (ListView) findViewById(R.id.listView2);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                myIntentToDetail(position);


            }
            // Toast.makeText(getApplicationContext(), "TEST " + position, Toast.LENGTH_SHORT).show();


        });
        myListView.setAdapter(objMyadapter);


    }//create View

    private void myIntentToDetail(int intClick) {
        Intent intent = new Intent(getApplicationContext(), ShowResult.class);
        intent.putExtra("click", intClick);
        startActivity(intent);
    }//method

    public void clickAboutMe(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://csclub.ssru.ac.th/s56122201021/csc3215"));
        startActivity(intent);


    } // Click
}
