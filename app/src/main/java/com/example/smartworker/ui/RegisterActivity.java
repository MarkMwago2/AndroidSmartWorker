package com.example.smartworker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.smartworker.R;
import com.example.smartworker.network.RetrofitClient;
import com.example.smartworker.network.SmartworkerAPI;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.smartworker.network.RetrofitClient.getInstance;

public class RegisterActivity extends AppCompatActivity {
    private EditText mnameEditText;
    private EditText memailEditText;
    private EditText mpasswordEditText;
    private EditText mconfirmPasswordEditText;
    private Button mcreateUserButton;
    private TextView mloginTextView;
    private SmartworkerAPI smartworkerAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mnameEditText = (EditText) findViewById(R.id.nameEditText);
        memailEditText = (EditText) findViewById(R.id.emailEditText);
        mpasswordEditText = (EditText) findViewById(R.id.passwordEditText);
        mconfirmPasswordEditText = (EditText) findViewById(R.id.confirmPasswordEditText);
        mcreateUserButton =  (Button) findViewById(R.id.createUserButton);
        mloginTextView = (TextView) findViewById(R.id.loginTextView);

        smartworkerAPI = RetrofitClient.retrofitClient().create(SmartworkerAPI.class);
        Call<ResponseBody> call = smartworkerAPI.registerUser()



//        Call<ResponseBody> call = getInstance()
//                .getSmartWorkerAPI()
//                .registerUser();

//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                try {
//                    String s = response.body().string();
//                    Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_LONG).show();
//                }catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                Toast.makeText(RegisterActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
//
//            }
//        });


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
