package com.example.cst438wk02hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button loginButton;

    private String mUsername;
    private String mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.usernameEditText);
        password = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUsername = username.getText().toString();
                mPassword = password.getText().toString();

                if(validateUsername(mUsername) && validatePassword(mPassword)){
                    Intent intent = LandingPage.getIntent(getApplicationContext(), "din_djarin");
                    startActivity(intent);
                }
                else if(!validateUsername(mUsername) && !validatePassword(mPassword)){
                    username.setError("Invalid Username");
                    password.setError("Invalid Password");
                }
                else if(!validateUsername(mUsername)){
                    username.setError("Invalid Username");
                }
                else if(!validatePassword(mPassword)){
                    password.setError("Invalid Password");
                }

            }
        });
    }

    public static boolean validateUsername(String mUser){
        if(mUser.equals("din_djarin")){
            return true;
        }
        return false;
    }

    public static boolean validatePassword(String mPass){
        if(mPass.equals("baby_yoda_ftw")){
            return true;
        }
        else{
            return false;
        }
    }

}