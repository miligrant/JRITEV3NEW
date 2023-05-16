package com.example.jritev3;

//data class
public class Job {

    //Variable
    private String title;
    private String description;
    private double budget;

    //Constructor

    public Job()
    {

    }
    public Job(String title, String description, double budget) {
        this.title = title;
        this.description = description;
        this.budget = budget;
    }

    //Setter and Getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }


}
