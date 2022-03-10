package com.akash.unitynest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }

        Button button = findViewById(R.id.Login_Button);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,LoginPage.class);
            startActivity(intent);
        });


    }
}