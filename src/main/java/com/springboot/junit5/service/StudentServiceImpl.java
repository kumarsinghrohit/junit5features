package com.springboot.junit5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.junit5.model.Course;
import com.springboot.junit5.model.Student;
import com.springboot.junit5.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> retrieveAllStudents() {
        return repository.retrieveAllStudents();
    }

    @Override
    public Student retrieveStudent(String studentId) {
        return repository.retrieveStudent(studentId);
    }

    @Override
    public List<Course> retrieveCourses(String studentId) {
        return repository.retrieveCourses(studentId);
    }

    @Override
    public Course retrieveCourse(String studentId, String courseId) {
        return repository.retrieveCourse(studentId, courseId);
    }

    @Override
    public Course addCourse(String studentId, Course course) {
        return repository.addCourse(studentId, course);
    }

    @Override
    public Course updateCourse(String studentId, String courseId, String courseName) {
        return repository.updateCourse(studentId, courseId, courseName);
    }
}