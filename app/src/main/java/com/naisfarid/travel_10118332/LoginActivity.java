//07-04-2021 - 10118332 - Nais Farid - IF8
package com.naisfarid.travel_10118332;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private Button btnRegist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ILogin = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(ILogin);

            }
        });

        btnRegist = findViewById(R.id.btn_regist);
        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent IRegist = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(IRegist);

            }
        });
    }
}