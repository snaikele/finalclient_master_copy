package com.developer.akashkale.message;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.developer.akashkale.client.R;

public class EMI extends AppCompatActivity {
    EditText amt,time,si;
    TextView emi;
    float a,p,r,n,m,rate;
    float b,pow,e;
    Button Btn2;
    ImageButton bkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);
        amt = (EditText)findViewById(R.id.amt);
        time =(EditText)findViewById(R.id.time);
        si=(EditText)findViewById(R.id.si);
        emi=(TextView)findViewById(R.id.emi);
        Button btn=(Button)findViewById(R.id.button);
        Btn2=(Button)findViewById(R.id.AGEBtnTop);
        bkBtn=(ImageButton)findViewById(R.id.backbtn);
        bkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(EMI.this,Home.class);
                startActivity(i);
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent1= new Intent(EMI.this,age.class);
            startActivity(intent1);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    p= Float.parseFloat(amt.getText().toString()) ;
                    r= Float.parseFloat(si.getText().toString()) ;
                    n= Float.parseFloat(time.getText().toString()) ;

                    //E = P×r×(1 + r)^n/((1 + r)^n - 1)
                    m=n*12;
                    rate=r/12/100;
                    pow = (float) Math.pow((1+rate),m);
                    a=p*rate*pow;
                    b=pow-1;
                    e=a/b;
                    emi.setText(String.format("%.2f",e));
                }
                catch (Exception e){
                    System.out.print(e);
                }

            }
        });



    }

}
