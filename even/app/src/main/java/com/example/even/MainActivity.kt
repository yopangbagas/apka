package com.example.even;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
 class MainActivity : AppCompatActivity() {
    EditText edUser,edPassword;
    Button buttonOK;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}