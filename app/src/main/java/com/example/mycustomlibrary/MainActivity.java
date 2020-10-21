package com.example.mycustomlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jitsisdk.PranitClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PranitClass.print(this,"WELCOME TO CUSTOM LIBRARY");
    }
}