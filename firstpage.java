package com.example.sanjay.memorygame;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class firstpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run() {
                Intent intent = new Intent(getApplicationContext(), welcome.class);
                startActivity(intent);
            }
        }, 3000);
    }
}
