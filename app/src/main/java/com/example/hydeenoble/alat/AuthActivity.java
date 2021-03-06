package com.example.hydeenoble.alat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        FrameLayout register = (FrameLayout) findViewById(R.id.registration);
        FrameLayout identification = (FrameLayout) findViewById(R.id.identification);
        FrameLayout login = (FrameLayout) findViewById(R.id.login);
        Button authLoginBtn = (Button) findViewById(R.id.auth_login);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AuthActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

        identification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AuthActivity.this, IdentificationActivity.class);
                startActivity(intent);
            }
        });

        authLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AuthActivity.this, OnboardingActivity.class);
                startActivity(intent);
            }
        });
    }
}
