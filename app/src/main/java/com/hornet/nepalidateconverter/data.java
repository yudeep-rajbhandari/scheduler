package com.hornet.nepalidateconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class data extends AppCompatActivity {
    Button Addschedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Addschedule=(Button)findViewById(R.id.button_add);

     Addschedule.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i=new Intent(data.this,MainActivity.class);
             startActivity(i);
         }
     });
    }
}
