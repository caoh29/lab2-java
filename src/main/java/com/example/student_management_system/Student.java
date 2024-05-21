package com.example.student_management_system;

import javafx.beans.property.SimpleStringProperty;

public class Student {
    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty major;

    Student (String id, String name, String major) {
        this.id = new SimpleStringProperty(id);
        this.name =  new SimpleStringProperty(name);
        this.major = new SimpleStringProperty(major);
    }

    public String getId() {
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getMajor() {
        return major.get();
    }

    public SimpleStringProperty majorProperty() {
        return major;
    }

    public void setMajor(String major) {
        this.major.set(major);
    }
}
