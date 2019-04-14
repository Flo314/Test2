package com.example.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }
    
    protected void sendButtonClicked(View view){
        Toast.makeText(this, username.getText() + " " + password.getText() + " : You clicked !", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TestIntention.class);
        startActivity(intent);
    }


}
