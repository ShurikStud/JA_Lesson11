package com.example.shurik.sharedpreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Utilities.saveUserEntity(this, new EntityUser(1, "first", "realy first"));

        EntityUser entityUser   = Utilities.loadUserEntity(this);

        Log.v("TAG-->", entityUser.toString());


    }
}
