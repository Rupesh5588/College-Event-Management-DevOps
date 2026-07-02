package com.rupesh.collegeevent.model;

public class Registration {

    private Integer id;
    private String studentName;
    private String email;
    private String department;
    private String eventName;

    public Registration() {
    }

    public Registration(Integer id, String studentName, String email, String department, String eventName) {
        this.id = id;
        this.studentName = studentName;
        this.email = email;
        this.department = department;
        this.eventName = eventName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}