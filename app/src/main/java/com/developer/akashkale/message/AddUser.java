package com.developer.akashkale.message;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.developer.akashkale.client.R;

public class AddUser extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(AddUser.this,Home.class);
                startActivity(intent);
                finish();
            }
        },3800);

        Intent it = getIntent();

        String b = it.getStringExtra(MainActivity.EXTRA_TEXT);
        String a = it.getStringExtra(MainActivity.EXTRA_NUMBER);


        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://sms.ascell.in/app/smsapi/index.php?key=35C459C005AB3A&routeid=240&type=text&contacts="+a+"&senderid=ASCELL&msg="+b);
        Toast.makeText(this, "http://sms.ascell.in/app/smsapi/index.php?key=35C459C005AB3A&routeid=240&type=text&contacts="+a+"&senderid=ASCELL&msg="+b, Toast.LENGTH_SHORT).show();
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
    }

