package com.imtiaz_acedamy.practiceproject_6.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.imtiaz_acedamy.practiceproject_6.R;

public class IntroActivity extends AppCompatActivity {

    ImageView startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_main);

        startBtn = (ImageView) findViewById(R.id.startBtn);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(IntroActivity.this, MainActivity.class));

            }
        });
    }
}