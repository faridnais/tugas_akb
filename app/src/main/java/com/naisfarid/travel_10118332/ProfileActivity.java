//07-04-2021 - 10118332 - Nais Farid - IF8
package com.naisfarid.travel_10118332;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    private CardView cardInstagram, cardTwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        cardInstagram = findViewById(R.id.cardInstagram);
        cardInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.instagram.com/faridnais8";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        cardTwitter = findViewById(R.id.cardTwitter);
        cardTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.twitter.com/naispeople";
                Intent t = new Intent(Intent.ACTION_VIEW);
                t.setData(Uri.parse(url));
                startActivity(t);
            }
        });
    }
}