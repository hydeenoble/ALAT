package com.example.hydeenoble.alat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        getSupportActionBar().setElevation(0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        FrameLayout identification = (FrameLayout) findViewById(R.id.identification);
        FrameLayout login = (FrameLayout) findViewById(R.id.login);
        Button createAccountBtn = (Button) findViewById(R.id.create_account);


        identification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationActivity.this, IdentificationActivity.class);
                startActivity(intent);
            }
        });

//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(RegistrationActivity.this, AuthActivity.class);
//                startActivity(intent);
//            }
//        });

        createAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationActivity.this, AuthActivity.class);
                startActivity(intent);
            }
        });
    }
}
