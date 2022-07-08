package com.mina.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void toRegistration (View view) {
        // Navigate to registration
        Intent intent = new Intent(LoginActivity.this, Registration.class);
        startActivity(intent);
    }

}