package com.akash.unitynest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import android.view.MenuItem;
import android.widget.Button;


public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.logout_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.logout_button)
        {
            Button button = findViewById(R.id.logout_button);
            button.setOnClickListener(view -> {
                Intent intent=new Intent(LoginPage.this,MainActivity.class);
                startActivity(intent);
            });
        }
        return super.onOptionsItemSelected(item);
    }
}