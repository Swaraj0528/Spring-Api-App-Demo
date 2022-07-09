package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Student;

@RestController

public class PostmanContoller {

	@PostMapping("/home")
	public Object demoMethod(@RequestBody @Valid Student student) {

		System.out.println(student);

		return student;
	}
	@PostMapping("/student")
	public ModelAndView saveStudent(@ModelAttribute Student student) {

		System.out.println(student);
		ModelAndView s1 = new ModelAndView();
		s1.setViewName("Student-data");
		s1.addObject("student",student);
		return s1;
	}

	@GetMapping("/home/{id}")
	public int getID(@PathVariable int id) {

		// processor code will come here if any
		return id;
	}
	
	@GetMapping("/findStudent")
	public ResponseEntity<List<Student>> findAll(){
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setId(1);
		s1.setStudentName("ssa");
		s1.setStream("ece");
		s2.setId(11);
		s2.setStudentName("swearta");
		s2.setStream("IT");
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
		
	}
	@GetMapping("/findStudent1")
	public List<Object> findAll1(){
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setId(1);
		s1.setStudentName("Pawan");
		s1.setStream("IT");
		s2.setId(11);
		s2.setStudentName("Shirsha");
		s2.setStream("MECH");
		List<Object> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		return list;
		
	}

}
