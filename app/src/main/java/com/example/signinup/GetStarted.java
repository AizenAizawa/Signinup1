package com.example.signinup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        Button button = findViewById(R.id.gtsstarted);

    }
    public void lopelope(View view){
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
}