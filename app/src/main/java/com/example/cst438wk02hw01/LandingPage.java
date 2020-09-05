package com.example.cst438wk02hw01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
    }

    public static Intent getIntent(Context context, String user){
        Intent intent = new Intent(context, LandingPage.class);
        intent.putExtra("INTENT", user);

        return intent;
    }
}