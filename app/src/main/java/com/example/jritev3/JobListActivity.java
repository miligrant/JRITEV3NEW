package com.example.jritev3;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class JobListActivity extends AppCompatActivity {
    RecyclerView jobRecyclerView;
    JobAdapter jobAdapter;
    List<Job> jobs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        //initialize Recycler view
        jobRecyclerView = findViewById(R.id.jobRecyclerView);
        jobRecyclerView.setLayoutManager(new LinearLayoutManager(JobListActivity.this, RecyclerView.VERTICAL,false));

        //initialize data job and adapter
        jobs = new ArrayList<>();
        jobAdapter = new JobAdapter(JobListActivity.this,jobs);
        jobRecyclerView.setAdapter(jobAdapter);

        //add data (COMPULSORY)
        jobs.add(new Job("test","test",20));

        //Uncomment below to create list(technically the same as above)
        //jobs.add(new Job("test","test",20));
    }
}
