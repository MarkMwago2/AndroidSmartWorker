package com.example.smartworker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.smartworker.R;

public class MainActivity extends AppCompatActivity {
    private Button mCreateProfileButton;
    private Button mViewJobsButton;
    private Button mViewProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCreateProfileButton = (Button) findViewById(R.id.CreateProfile);
        mViewJobsButton = (Button) findViewById(R.id.ViewJobs);
        mViewProfileButton = (Button) findViewById(R.id.ViewProfile);

        mCreateProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, CreateProfileActivity.class);
                startActivity(intent1);
            }
        });
        mViewJobsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, ViewJobsActivity.class);
                startActivity(intent2);

            }
        });
        mViewProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, ViewProfileActivity.class);
                startActivity(intent3);


            }
        });

    }
}
