package com.example.hydeenoble.alat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class IdentificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);
        getSupportActionBar().setElevation(0);

        FrameLayout register = (FrameLayout) findViewById(R.id.registration);
        FrameLayout login = (FrameLayout) findViewById(R.id.login);
        Button nextBtn = (Button) findViewById(R.id.next);

//        register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(IdentificationActivity.this, RegistrationActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(IdentificationActivity.this, AuthActivity.class);
//                startActivity(intent);
//            }
//        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IdentificationActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}
