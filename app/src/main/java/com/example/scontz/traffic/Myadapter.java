package com.example.scontz.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.scontz.traffic.R;

/**
 * Created by scOnTz on 28/9/2559.
 */
public class Myadapter extends BaseAdapter {

    //explicit

    private Context objContext;
    private int[] trafficints;
    private String[] trafficStrings;

    public Myadapter(Context onjContext, int[] traffucUbts, String[] trafficStrings) {
        this.objContext = onjContext;
        this.trafficints = traffucUbts;
        this.trafficStrings = trafficStrings;
    }// Constructor


    @Override
    public int getCount() {
        return trafficStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //Show Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imvShowIcon);
        iconImageView.setBackgroundResource(trafficints[i]);

        //Show Titlte
        TextView titleTextView = (TextView) view1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(trafficStrings[i]);
        return view1;
    }


} //Main class
