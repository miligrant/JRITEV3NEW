package com.example.jritev3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {
    private List<Job> jobs;
    //private OnItemClickListener listener;
    private Context context;

    /*public interface OnItemClickListener {
        void onCreate(Bundle savedInstanceState);

        void onItemClick(Job job);
    }*/

    public JobAdapter(Context context,List<Job> jobs) {
        this.context=context;
        this.jobs = jobs;
        //this.listener = listener;
    }

    @NonNull
    @Override
    public JobAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_job, parent, false);
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_job,parent,false));
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Job job = jobs.get(position);
        holder.budgetTextView.setText("hundred");
        holder.titleTextView.setText("range");
        holder.descriptionTextView.setText("range of fee");
        //holder.bind(job, listener);
    }

    @Override
    public int getItemCount() {
        return jobs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTextView;
        private TextView descriptionTextView;
        private TextView budgetTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            budgetTextView = itemView.findViewById(R.id.budgetTextView);
        }

        /*public void bind(final Job job, final OnItemClickListener listener) {
            /*titleTextView.setText(job.getTitle());
            descriptionTextView.setText(job.getDescription());
            budgetTextView.setText(String.valueOf(job.getBudget()));
            titleTextView.setText("JobView");
            descriptionTextView.setText("JobView");
            budgetTextView.setText(String.valueOf("JobView"));
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(job);
                }
            });
        }*/
    }
}
