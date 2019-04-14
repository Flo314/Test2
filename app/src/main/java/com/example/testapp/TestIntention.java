package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class TestIntention extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_intention);
    }

    protected void goToFragment(View view){
        Toast.makeText(this, "Click vers fragment statique", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TestFragment.class);
        startActivity(intent);
    }
}
