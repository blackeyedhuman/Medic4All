package com.chakravarthy.cibi.medic4all;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fe);
    }
    public void othsym(View view) {
        Intent oth=new Intent(this,fed.class);
        startActivity(oth);
    }
}
