package com.example.user.olderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button B1,B2,B3,B4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       B1 = (Button)this.findViewById(R.id.button1);
        B2 = (Button)this.findViewById(R.id.button2);
        B3 = (Button)this.findViewById(R.id.button3);
        B4 = (Button)this.findViewById(R.id.button4);

        B1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                Intent EatDrug = new Intent();
                EatDrug.setClass(MainActivity.this,DrugActivity.class);
                startActivity(EatDrug);
            }
        });

        B2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                Intent PhoneCall = new Intent();
                PhoneCall.setClass(MainActivity.this,phone.class );
                startActivity(PhoneCall);
            }
        });

        B3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                Intent IsLost = new Intent();
                IsLost.setClass(MainActivity.this,MapsActivity.class );
                startActivity(IsLost);
            }//
        });

        B4.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v){
                Intent SelfInfo = new Intent();
                SelfInfo.setClass(MainActivity.this,SelfInfo.class );
                startActivity(SelfInfo);
            }
        });
    }
}
