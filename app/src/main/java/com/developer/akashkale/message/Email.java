package com.developer.akashkale.message;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.developer.akashkale.client.R;

public class Email extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_TEXT = "com.developer.akashkale.client.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.developer.akashkale.client.EXTRA_NUMBER";
    public static final String EXTRA_STRING = "com.developer.akashkale.client.EXTRA_STRING";

    EditText ed1,ed2,ed3;
    final Context context = this;
    Button bt1;
    ImageButton bkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        ed1 = findViewById(R.id.etEmail);
        ed2 = findViewById(R.id.etMessageEmail);
        ed3 = findViewById(R.id.etSubject);
        bt1 = findViewById(R.id.btSubmit2);
        bt1.setOnClickListener(this);
        bkBtn=(ImageButton)findViewById(R.id.backbtn);
        bkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Email.this,Home.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onClick(View v) {
        String a = ed1.getText().toString();
        String b = ed2.getText().toString();
        String c = ed3.getText().toString();
        Intent it = new Intent(Email.this,EmailView.class);
        it.putExtra(EXTRA_NUMBER,a);
        it.putExtra(EXTRA_TEXT,b);
        it.putExtra(EXTRA_STRING,c);
        startActivity(it);
    }
}
