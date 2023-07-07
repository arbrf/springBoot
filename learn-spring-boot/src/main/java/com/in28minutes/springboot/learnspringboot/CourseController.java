package com.in28minutes.springboot.learnspringboot;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/courses

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		
		return Arrays.asList(
				
				new Course(1,"Spring","in28minutes"),
				new Course(3,"Azure","in28minutes"),
				new Course(4,"AWS","in28minutes"),
				new Course(2,"Cloud","in28minutes")
				
				);
				
				
		
	}

}
