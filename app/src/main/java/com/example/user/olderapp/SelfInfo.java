package com.example.user.olderapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SelfInfo extends AppCompatActivity {

    private String Name = new String();
    private String Birth = new String();
    private String Address = new String();
    private String PhoneNum = new String();
    private String EmergencyName = new String();
    private String EmergencyPhoneNum = new String();
    private Boolean IsSet = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(IsSet == false){
            setContentView(R.layout.selfinfofirst);
        }
        else {
            setContentView(R.layout.selfinfo);
        }
    }


}
