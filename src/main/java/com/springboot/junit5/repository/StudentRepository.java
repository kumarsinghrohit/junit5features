package com.springboot.junit5.repository;

import java.util.List;

import com.springboot.junit5.model.Course;
import com.springboot.junit5.model.Student;

public interface StudentRepository {
    public List<Student> retrieveAllStudents();

    public Student retrieveStudent(String studentId);

    public List<Course> retrieveCourses(String studentId);

    public Course retrieveCourse(String studentId, String courseId);

    public Course addCourse(String studentId, Course course);

    public Course updateCourse(String studentId, String courseId, String courseName);
}