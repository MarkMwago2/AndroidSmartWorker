package com.example.smartworker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity{
    private Button mPasswordLoginButton;
    private EditText memailEditText;
    private EditText mpasswordEditText;
    private TextView mregisterTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mPasswordLoginButton =  (Button) findViewById(R.id.passwordLoginButton);
        mregisterTextView = (TextView) findViewById(R.id.registerTextView);


        mPasswordLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent4);
            }
        });

        mregisterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent5);
            }
        });




    }
}
