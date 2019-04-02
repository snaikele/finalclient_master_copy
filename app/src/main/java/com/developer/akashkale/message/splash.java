package com.developer.akashkale.message;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.developer.akashkale.client.R;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(splash.this,Home.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
