package com.example.user1.newobd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

   Switch switch1;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = (Switch)findViewById(R.id.switch1);


    }

}
