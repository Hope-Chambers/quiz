package org.launchcode.quiz.assignment;

import java.util.Date;

public class CodingProject implements Gradeable{

    private int pointTotal;
    private int userScore;
    private String ghClassroomUrl;
    private String repositoryUrl;
    private Date dueDate;
    private String description;

    public CodingProject(String ghClassroomUrl, Date dueDate, String description){
        this.ghClassroomUrl=ghClassroomUrl;
        this.dueDate=dueDate;
        this.description=description;

    }
    public CodingProject(String ghClassroomUrl, Date dueDate, String description, int pointTotal){
        this(ghClassroomUrl,dueDate,description);
        this.pointTotal=pointTotal;
    }

    @Override
    public int getPointTotal() {
        return this.pointTotal;
    }

    @Override
    public int getUserScore() {
        return this.userScore;
    }

    @Override
    public double getScorePercentage() {
        return (double) this.userScore / (double) this.pointTotal;
    }

    @Override
    public String getDisplayScorePercentage() {
        return null ;
    }
}
