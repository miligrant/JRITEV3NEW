package com.example.jritev3;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {

    private Context context;
    private List<Job> jobs;


    //Constructor
    public JobAdapter(Context context,List<Job> jobs) {
        this.context=context;
        this.jobs = jobs;
    }

    //Inflate adapter to View
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_job,parent,false));
    }

    //Set view values(textview,imageview) from adapter UI
    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d("TEST","TEST");
        Job job = jobs.get(position);

        holder.budgetTextView.setText("RM"+job.getBudget());
        holder.titleTextView.setText(job.getTitle());
        holder.descriptionTextView.setText(job.getDescription());

        //use to set onClickListener
        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }

    //get size of adapter
    @Override
    public int getItemCount() {
        return jobs.size();
    }

    //Initialize view and find for UI ID
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView,descriptionTextView, budgetTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            budgetTextView = itemView.findViewById(R.id.budgetTextView);
        }
    }
}
