package com.example.finalyearprojext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseUser user;
    CardView myCalender ,myMeds ,myCommunity ,myTracker,myResources,findACenter, Settings, Emergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCalender = findViewById(R.id.myCalender);
        myMeds = findViewById(R.id.myMeds);
        myTracker = findViewById(R.id.myTracker);
        myResources = findViewById(R.id.myResources);
        findACenter = findViewById(R.id.findCenter);
        Settings = findViewById(R.id.settings);
        myCommunity = findViewById(R.id.myCommunity);
        Emergency = findViewById(R.id.emergency);



        myCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyCalender.class);
                startActivity(intent);
                finish();
            }
            });

        myMeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, myMeds.class);
                startActivity(intent);
                finish();
            }
        });

        myCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, myCommunity.class);
                startActivity(intent);
                finish();
            }
        });
        myTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, myTracker.class);
                startActivity(intent);
                finish();
            }
        });
        myResources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, myResources.class);
                startActivity(intent);
                finish();
            }
        });
        findACenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FindCenter.class);
                startActivity(intent);
                finish();
            }
        });
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
                finish();
            }
        });

        Emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
                finish();
            }
        });



                auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        if (user == null) {
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            finish();
        }

    }

}

