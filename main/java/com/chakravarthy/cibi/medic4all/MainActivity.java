package com.chakravarthy.cibi.medic4all;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MediaPlayer mediaPlayer = MediaPlayer.create(this,R)
    }
    public void symdes(View view) {
        EditText sym=(EditText)findViewById(R.id.edtext);
        String s= ""+sym.getText();
    if(s.contains("headache"))
    {
        Intent nxtm=new Intent(this,symptomdescription.class);
        startActivity(nxtm);

    }

      else  if(s.contains("skin"))
        {
            Intent nxtm=new Intent(this,skra.class);
            startActivity(nxtm);

        } else if(s.contains("fever"))
        {
            Intent nxtm=new Intent(this,fe.class);
            startActivity(nxtm);

        } else if(s.contains("injury"))
        {
            Intent nxtm=new Intent(this,inju.class);
            startActivity(nxtm);

        } else if(s.contains("eye"))
        {
            Intent nxtm=new Intent(this,eyesi.class);
            startActivity(nxtm);

        } else if(s.contains("breath"))
        {
            Intent nxtm=new Intent(this,breathingpro.class);
            startActivity(nxtm);

        }
        else if(s.contains("diarrhoea"))
        {
            Intent nxtm=new Intent(this,diar.class);
            startActivity(nxtm);

        }
    else
    {
        Toast.makeText(this, "we don't have the database for your symptom", Toast.LENGTH_SHORT).show();
    }

    }
}
