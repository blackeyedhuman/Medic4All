package com.chakravarthy.cibi.medic4all;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class breapros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breapros);
    }
    public void doclist(View view) {
        Intent docl=new Intent(this,breaprod.class);
        startActivity(docl);
    }
}
