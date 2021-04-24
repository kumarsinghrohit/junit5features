package com.springboot.junit5.service;

import java.util.List;

import com.springboot.junit5.model.Course;
import com.springboot.junit5.model.Student;

public interface StudentService {

    List<Student> retrieveAllStudents();

    Student retrieveStudent(String studentId);

    List<Course> retrieveCourses(String studentId);

    Course retrieveCourse(String studentId, String courseId);

    Course addCourse(String studentId, Course course);

    Course updateCourse(String studentId, String courseId, String courseName);

}