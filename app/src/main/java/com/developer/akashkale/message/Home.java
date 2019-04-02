package com.developer.akashkale.message;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.developer.akashkale.client.R;

public class Home extends AppCompatActivity implements View.OnClickListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    ImageButton bt1,bt2,bt3;
    Button Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setUpToolBar();
        bt1 = findViewById(R.id.btMessage);
        bt2 = findViewById(R.id.btEmail);
        bt3 =findViewById(R.id.btCalEMI);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        navigationView =(NavigationView) findViewById(R.id.nevigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.item1:
                        Intent i = new Intent(Home.this,Home.class);
                        startActivity(i);

                        break;
                    case R.id.item2:

                        Toast.makeText(Home.this, "Feature Unaviable..", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item5:
                        Intent i3 =new Intent(Home.this,web_viewLink.class);
                        startActivity(i3);
                        break;

                    case R.id.item6:
                        Intent i6 =new Intent(Home.this,aboutus1.class);
                        startActivity(i6);
                        break;
                    case R.id.item8:
                        Intent i4 =new Intent(Home.this,splash.class);
                        startActivity(i4);
                        break;
                }

                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btCalEMI:
                Intent intent3 = new Intent(this, EMI.class);
                startActivity(intent3);
                Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btMessage:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btEmail:
                Intent intent2 = new Intent(this, Email.class);
                startActivity(intent2);
                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
                break;

        }
    }
    private void setUpToolBar()
    {
        drawerLayout=(DrawerLayout) findViewById(R.id.drawerLayout);
        toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


    }
}
