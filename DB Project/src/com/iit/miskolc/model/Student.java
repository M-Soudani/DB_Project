package com.iit.miskolc.model;

public class Student {

    private int studentID;
    private int departmentID;
    private int programID;
    private String trainingMethod;
    private String currentSemester;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public String getTrainingMethod() {
        return trainingMethod;
    }

    public void setTrainingMethod(String trainingMethod) {
        this.trainingMethod = trainingMethod;
    }

    public String getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(String currentSemester) {
        this.currentSemester = currentSemester;
    }
}
