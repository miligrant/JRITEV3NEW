package com.example.jritev3;

public class Job {
    private String title;
    private String description;
    private double budget;

    public Job(String title, String description, double budget) {
        this.title = title;
        this.description = description;
        this.budget = budget;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getBudget() {
        return budget;
    }
}
