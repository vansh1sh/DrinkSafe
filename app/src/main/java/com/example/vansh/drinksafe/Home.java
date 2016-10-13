package com.example.vansh.drinksafe;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;



public class Home extends AppCompatActivity {
    ImageView check;
    ImageView calc;
    ImageView lock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        check=(ImageView)findViewById(R.id.checkbutton);
        calc=(ImageView)findViewById(R.id.calculatebutton);
        lock=(ImageView)findViewById(R.id.lockbutton);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Home.this, CheckActivity.class);
                startActivity(i);
            }


        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Home.this, Input.class);
                startActivity(k);
            }


        });
        lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Home.this,LockActivity.class);
                startActivity(k);
            }


        });



    }
}
