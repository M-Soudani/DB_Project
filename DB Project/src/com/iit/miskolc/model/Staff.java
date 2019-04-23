package com.iit.miskolc.model;

import java.util.Date;

public class Staff extends Person {
    private int staffID;
    private int salary;
    private Date employment_Date;

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getEmployment_Date() {
        return employment_Date;
    }

    public void setEmployment_Date(Date employment_Date) {
        this.employment_Date = employment_Date;
    }
}
