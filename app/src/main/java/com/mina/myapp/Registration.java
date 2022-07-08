package com.mina.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.Tag;

public class Registration extends AppCompatActivity {


    // Elements
    EditText usernameField, passwordField, emailField, phoneField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        // Get elements
        usernameField = findViewById(R.id.usernameField);
        passwordField = findViewById(R.id.passwordField);
        emailField = findViewById(R.id.emailField);
        phoneField = findViewById(R.id.phoneField);
    }

    public void registration(View view) {
        // fetch reference database
        FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
        DatabaseReference myRef = mDatabase.getReference("accounts/username");
        DatabaseReference myRef1 = mDatabase.getReference("accounts/password");
        DatabaseReference myRef2 = mDatabase.getReference("accounts/email");
        DatabaseReference myRef3 = mDatabase.getReference("accounts/phone");
        // Get form value
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        String email = emailField.getText().toString();
        String phone = phoneField.getText().toString();

        // Insert new values
        myRef.setValue(username);
        myRef1.setValue(password);
        myRef2.setValue(email);
        myRef3.setValue(phone);

        Intent intent = new Intent(Registration.this, LoginActivity.class);
        startActivity(intent);

    }

    public void toLogin ( View view ) {
        // Navigate to Login
        Intent intent = new Intent(Registration.this, LoginActivity.class);
        startActivity(intent);
    }

}