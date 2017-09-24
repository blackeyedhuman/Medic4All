package com.chakravarthy.cibi.medic4all;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class diard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diard);
    }
    public void showcheck(View view) {
        LinearLayout check=(LinearLayout)findViewById(R.id.check);
        check.setVisibility(View.VISIBLE);
        RelativeLayout rel1=(RelativeLayout)findViewById(R.id.rel1);
        rel1.setVisibility(View.INVISIBLE);
        RelativeLayout rel2=(RelativeLayout)findViewById(R.id.rel2);
        rel2.setVisibility(View.INVISIBLE);
        RelativeLayout rel3=(RelativeLayout)findViewById(R.id.rel3);
        rel3.setVisibility(View.INVISIBLE);
    }

    public void click12(View view) {
        RelativeLayout rel1=(RelativeLayout)findViewById(R.id.rel1);
        LinearLayout le1=(LinearLayout)findViewById(R.id.check);
        TextView t1=(TextView)findViewById(R.id.ti1);
        String s="12:00";
        String t= String.format("%s", t1.getText());
        if(t.compareTo("12:00")<0)
        {
            rel1.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
        RelativeLayout rel2=(RelativeLayout)findViewById(R.id.rel2);
        TextView ti2=(TextView)findViewById(R.id.ti2);
        String t2= String.format("%s", ti2.getText());

        if(t2.compareTo("12:00")<0)
        {
            rel2.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
        RelativeLayout rel3=(RelativeLayout)findViewById(R.id.rel3);
        TextView t3=(TextView)findViewById(R.id.ti3);
        String ti3= String.format("%s", t3.getText());
        Toast.makeText(this, ti3, Toast.LENGTH_SHORT).show();

        if(ti3.compareTo("12:00")<0)
        {
            rel3.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }


    }

    public void click4(View view) {
        RelativeLayout rel1=(RelativeLayout)findViewById(R.id.rel1);
        LinearLayout le1=(LinearLayout)findViewById(R.id.check);
        TextView t1=(TextView)findViewById(R.id.ti1);
        String s="12:00";
        String t= String.format("%s", t1.getText());
        if(t.compareTo("16:00")<0)
        {
            rel1.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
        RelativeLayout rel2=(RelativeLayout)findViewById(R.id.rel2);
        TextView ti2=(TextView)findViewById(R.id.ti2);
        String t2= String.format("%s", ti2.getText());

        if(t2.compareTo("16:00")<0)
        {
            rel2.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
        RelativeLayout rel3=(RelativeLayout)findViewById(R.id.rel3);
        TextView t3=(TextView)findViewById(R.id.ti3);
        String ti3= String.format("%s", t3.getText());
        Toast.makeText(this, ti3, Toast.LENGTH_SHORT).show();

        if(ti3.compareTo("16:00")<0)
        {
            rel3.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
    }

    public void click9(View view) {
        RelativeLayout rel1=(RelativeLayout)findViewById(R.id.rel1);
        LinearLayout le1=(LinearLayout)findViewById(R.id.check);
        TextView t1=(TextView)findViewById(R.id.ti1);
        String s="19:00";
        String t= String.format("%s", t1.getText());
        if(t.compareTo("19:00")<0)
        {
            rel1.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
        RelativeLayout rel2=(RelativeLayout)findViewById(R.id.rel2);
        TextView ti2=(TextView)findViewById(R.id.ti2);
        String t2= String.format("%s", ti2.getText());

        if(t2.compareTo("19:00")<0)
        {
            rel2.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
        RelativeLayout rel3=(RelativeLayout)findViewById(R.id.rel3);
        TextView t3=(TextView)findViewById(R.id.ti3);
        String ti3= String.format("%s", t3.getText());

        if(ti3.compareTo("19:00")<0)
        {
            rel3.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
    }

    public void click10(View view) {
        RelativeLayout rel1=(RelativeLayout)findViewById(R.id.rel1);
        LinearLayout le1=(LinearLayout)findViewById(R.id.check);
        TextView t1=(TextView)findViewById(R.id.ti1);
        String s="22:00";
        String t= String.format("%s", t1.getText());
        if(t.compareTo("22:00")<0)
        {
            rel1.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
        RelativeLayout rel2=(RelativeLayout)findViewById(R.id.rel2);
        TextView ti2=(TextView)findViewById(R.id.ti2);
        String t2= String.format("%s", ti2.getText());

        if(t2.compareTo("22:00")<0)
        {
            rel2.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
        RelativeLayout rel3=(RelativeLayout)findViewById(R.id.rel3);
        TextView t3=(TextView)findViewById(R.id.ti3);
        String ti3= String.format("%s", t3.getText());
        Toast.makeText(this, ti3, Toast.LENGTH_SHORT).show();

        if(ti3.compareTo("22:00")<0)
        {
            rel3.setVisibility(View.VISIBLE);
            le1.setVisibility(View.INVISIBLE);
        }
    }
}
