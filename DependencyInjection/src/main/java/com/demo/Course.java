package com.demo;

public class Course {

    // Course ID
    private int courseId;

    // Course Name
    private String courseName;

    // Constructor
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId +
                ", courseName=" + courseName + "]";
    }
}
