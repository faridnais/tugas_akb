//07-04-2021 - 10118332 - Nais Farid - IF8
package com.naisfarid.travel_10118332;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private CardView cardProfile,cardLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardProfile = findViewById(R.id.cardProfile);

        cardProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IProfile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(IProfile);
            }
        });

        cardLogout = findViewById(R.id.cardLogout);

        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ILogout = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(ILogout);
            }
        });

    }
}