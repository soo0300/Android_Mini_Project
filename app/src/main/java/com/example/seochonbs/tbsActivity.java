package com.example.seochonbs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tbsActivity extends AppCompatActivity {

    Button backmain, goinsta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tbs);

        backmain = (Button) findViewById(R.id.backButton);
        backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tbsActivity.this, MainActivity.class));
            }
        });

        Uri insta_uri = Uri.parse("https://www.instagram.com/tbs_book_society/");
        Intent insta_intent = new Intent(Intent.ACTION_VIEW, insta_uri);

        goinsta = (Button) findViewById(R.id.instaButton);
        goinsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(insta_intent);
            }
        });
    }
}