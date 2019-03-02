package com.alonemusk.schedule;

import android.app.ActionBar;
import android.content.Context;
import android.support.constraint.solver.widgets.ConstraintHorizontalLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private LinearLayout ll;
    ArrayList<Btnarr> bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt= new ArrayList<>();
    btn=(Button) findViewById(R.id.add);
    ll=(LinearLayout) findViewById(R.id.ll);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Btnarr btu=new Btnarr();
            bt.add(btu);
            bt.get(0).show(MainActivity.this,ll);
        }
    });




    }

}
