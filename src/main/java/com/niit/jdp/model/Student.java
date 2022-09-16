/*
 * Author Name : M.Krishna.
 * Date: 16-09-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.model;

import java.util.Objects;

public class Student {
    private String name;
    private int rollNumber;
    private String grades;

    public Student() {
    }

    public Student(String name, int rollNumber, String grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (rollNumber != student.rollNumber) return false;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + rollNumber;
        result = 31 * result + (grades != null ? grades.hashCode() : 0);
        return result;
    }
}
