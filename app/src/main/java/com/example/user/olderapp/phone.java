package com.example.user.olderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by stuD on 2016/1/23.
 */
public class phone extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phonecall);
        Button b = (Button)this.findViewById(R.id.policecall);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    }

}
