package com.example.control_work;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class MainActivity_0 extends AppCompatActivity {

    private final String TAG = "MainActivity";
    EditText editTextLogin;
    EditText editTextPassword;
    Button buttonAuth;

    private Map loginPassword = new HashMap(){{
        put("vasya","123456");
        put("petya","qwerty");
        put("kolya","12345678");
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_0);

        editTextLogin = findViewById(R.id.editTextLogin);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonAuth = findViewById(R.id.buttonAuth);

        buttonAuth.setOnClickListener(view->{
            if (loginPassword.containsKey(editTextLogin.getText().toString())
                    && loginPassword.get(editTextLogin.getText().toString())
                    .equals(editTextPassword.getText().toString())) {
                    startActivity(
                            new Intent(this, MainActivity_1.class)
                    );
                }
        });


    }
}