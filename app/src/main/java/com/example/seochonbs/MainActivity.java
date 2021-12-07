package com.example.seochonbs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button irasun, tbs, ota, sch, rabbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        irasun = (Button)findViewById(R.id.button1);
        tbs = (Button)findViewById(R.id.button2);
        ota = (Button)findViewById(R.id.button3);
        sch = (Button)findViewById(R.id.button4);
        rabbit = (Button)findViewById(R.id.button5);

        irasun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, irasunActivity.class));
            }
        });

        tbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, tbsActivity.class));
            }
        });

        ota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, otaActivity.class));
            }
        });

        sch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, schActivity.class));
            }
        });

        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, rabbitActivity.class));
            }
        });
    }
}