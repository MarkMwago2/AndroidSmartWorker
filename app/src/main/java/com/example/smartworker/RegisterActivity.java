package com.example.smartworker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private EditText mnameEditText;
    private EditText memailEditText;
    private EditText mpasswordEditText;
    private EditText mconfirmPasswordEditText;
    private Button mcreateUserButton;
    private TextView mloginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mcreateUserButton =  (Button) findViewById(R.id.createUserButton);
        mloginTextView = (TextView) findViewById(R.id.loginTextView);


        mcreateUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent6);
            }
        });

        mloginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent7);
            }
        });
    }
}
