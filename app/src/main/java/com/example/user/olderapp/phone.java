package com.example.user.olderapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by stuD on 2016/1/23.
 */
public abstract class phone extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phonecall);
        Button b = (Button)this.findViewById(R.id.policecall);
        b.setOnClickListener(this);
        Button b1 = (Button)this.findViewById(R.id.family);
        b1.setOnClickListener(this);
        Button b2 = (Button)this.findViewById(R.id.help);
        b1.setOnClickListener(this);
    }

    public void call_police(View view) {
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        phoneIntent.setData(Uri.parse("tel:110"));
    }
    public void callfamily(View view) {
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        phoneIntent.setData(Uri.parse("tel:123456789"));
    }
    public void helpme(View view) {
        Intent phoneIntent = new Intent(Intent.ACTION_CALL);
        phoneIntent.setData(Uri.parse("tel:119"));
    }

}
