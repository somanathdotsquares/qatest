package com.springrest.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.spring.entities.Course;
import com.springrest.spring.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "this is home";
	}

	// get the list of courses
//	@RequestMapping(path="/courses",method=RequestMethod.GET)
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();

	}

	// get the single course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));

	}
	//Add new course
	//@PostMapping(path="/courses",consumes="application/json")
	@PostMapping("/courses")
	public Course addcourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
		
	}
	
	//Update course
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@PathVariable String courseId) {
		return this.courseService.updateCourse(Long.parseLong(courseId));
		
	}
	//Delete course
	@DeleteMapping("/courses/{courseId}")
	public Course deleteCourse(@PathVariable String courseId) {
		return this.courseService.deleteCourse(Long.parseLong(courseId));
		 
	}
}
