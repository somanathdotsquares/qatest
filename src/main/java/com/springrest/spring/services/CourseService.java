package com.springrest.spring.services;

import java.util.List;

import com.springrest.spring.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(long courseId);
	public Course deleteCourse(long courseId);
	
	
}
