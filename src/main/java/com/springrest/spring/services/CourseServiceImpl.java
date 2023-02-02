package com.springrest.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.spring.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(125, "Java course", "This is demo description for java course"));
		list.add(new Course(128, "Python course", "This is demo description for Python course"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {

		Course c = null;

		for (Course course : list) {
			if (course.getId() == courseId) {
				c = course;
				break;
			}
		}

		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.remove(course);
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(long courseId) {
		// TODO Auto-generated method stub

		Course c = null;

		for (Course course2 : list) {
			if (course2.getId() == courseId) {
				c = course2;
				break;
			}
		}
		list.remove(c);
		return c;

	}

	@Override
	public Course deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
