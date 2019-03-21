package com.github.fac30ff.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormToUpperCase(HttpServletRequest request, Model model) {
		//read the request parameter from the HTML form
		String name = request.getParameter("studentName");
		//convert the data to all caps
		name = name.toUpperCase();
		//create the message
		String result = "Hello " + name;
		//add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwoA")
	public String processFormToUpperCaseWithParameter(@RequestParam("studentName") String studenName, Model model) {
		//convert the data to all caps
		studenName = studenName.toUpperCase();
		//create the message
		String result = "Hello " + studenName;
		//add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
}
