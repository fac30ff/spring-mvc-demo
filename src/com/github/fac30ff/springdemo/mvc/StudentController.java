package com.github.fac30ff.springdemo.mvc;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//create a new student object
		Student student = new Student();
		//add  student object to the model
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@RequestMapping("/showForm2")
	public String showForm2(Model model) {
		//create a new student object
		Student student = new Student();
		//add  student object to the model
		model.addAttribute("student", student);
		//add the country options to the model
		model.addAttribute("theCountryOptions", countryOptions);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		//log the input data
		System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
		if ( bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "student-confirmation";
		}
	}
}
