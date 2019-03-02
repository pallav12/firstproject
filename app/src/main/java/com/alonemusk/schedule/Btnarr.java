package com.alonemusk.schedule;

import android.content.Context;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class Btnarr {
    Btnarr(){



    }
    void show(Context t, LinearLayout ll){

        LinearLayout lt = new LinearLayout(t);
        lt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        ll.addView(lt);
        CheckBox cb=new CheckBox(t);
        cb.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        cb.setHint("description");
        cb.setWidth(310);
        cb.setHeight(66);
        lt.addView(cb);
        Button bon=new Button(t);
        bon.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        bon.setHeight(66);
        bon.setText("Edit");
        lt.addView(bon);
        Button bn=new Button(t);
        bn.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        bn.setText("+");
        lt.addView(bn);


    }



}
