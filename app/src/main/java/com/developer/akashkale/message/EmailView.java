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

public class EmailView extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_view);
        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(EmailView.this,Home.class);
                startActivity(intent);
                finish();
            }
        },3800);
        Intent it = getIntent();
String a,b,c;
         b = it.getStringExtra(MainActivity.EXTRA_TEXT);
         a = it.getStringExtra(MainActivity.EXTRA_NUMBER);
         c = it.getStringExtra(MainActivity.EXTRA_STRING);

        webView = findViewById(R.id.webViewE);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://ascellent.co.in/email/emailSender.php?senderEmail=snaikele@gmail.com&receiverEmail="+a+"&subject="+c+"&msg="+b);
        Toast.makeText(this, "http://ascellent.co.in/email/emailSender.php?senderEmail=Ajay@ascellent.co.in&receiverEmail="+a+"&subject="+c+"&msg="+b, Toast.LENGTH_SHORT).show();
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
