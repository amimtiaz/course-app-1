package com.imtiaz_acedamy.practiceproject_6.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.imtiaz_acedamy.practiceproject_6.R;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout btn1, btn2, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ConstraintLayout) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, CourseListActivity.class));

            }
        });

    }
}