package com.developer.akashkale.message;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import com.developer.akashkale.client.R;

public class web_viewLink extends AppCompatActivity {
WebView webView;
ImageButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_link);
        webView = findViewById(R.id.webViewLink);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.ascellent.co.in/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        btn =(ImageButton) findViewById(R.id.backbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(web_viewLink.this,Home.class);
                startActivity(i);
            }
        });
    }
}
