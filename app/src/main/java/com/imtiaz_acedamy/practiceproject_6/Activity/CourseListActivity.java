package com.imtiaz_acedamy.practiceproject_6.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.imtiaz_acedamy.practiceproject_6.Adapter.CourseAdapter;
import com.imtiaz_acedamy.practiceproject_6.Domain.CourseDomain;
import com.imtiaz_acedamy.practiceproject_6.R;

import java.util.ArrayList;

public class CourseListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourceList;
    private RecyclerView recyclerViewCource;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);

        ConstraintLayout backBtn = (ConstraintLayout) findViewById(R.id.backBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(CourseListActivity.this, MainActivity.class));

            }
        });

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<CourseDomain> items = new ArrayList<>();
        items.add(new CourseDomain("Advanced certification Program in AI",169,"ic_1"));
        items.add(new CourseDomain("Google cloud Platform Architecture",69,"ic_2"));
        items.add(new CourseDomain("Fundamental of java Programming",150,"ic_3"));
        items.add(new CourseDomain("Introduction to UI design history",79,"ic_4"));
        items.add(new CourseDomain("PG Program in Big Data Engineering",49,"ic_5"));
        
        recyclerViewCource = (RecyclerView) findViewById(R.id.view);
        recyclerViewCource.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapterCourceList = new CourseAdapter(items);
        recyclerViewCource.setAdapter(adapterCourceList);
        
    }
}