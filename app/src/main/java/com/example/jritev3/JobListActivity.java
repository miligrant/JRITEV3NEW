package com.example.jritev3;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class JobListActivity extends AppCompatActivity {
    private RecyclerView jobRecyclerView;
    private JobAdapter jobAdapter;
    private List<Job> jobs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        jobRecyclerView = findViewById(R.id.jobRecyclerView);
        jobRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        jobs = new ArrayList<>(); // Populate this list with actual jobs from your data source

        jobAdapter = new JobAdapter(this,jobs);
        jobRecyclerView.setAdapter(jobAdapter);
    }

    /*@Override
    public void onItemClick(Job job) {
        // Handle the click event for a specific job item
        // You can start a new activity to display job details or proceed with the bidding process
    }*/
}
