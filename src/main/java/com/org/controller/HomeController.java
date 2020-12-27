package com.org.controller;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.org.model.*;
@Controller
public class HomeController {
	/*
	 * pass the value from controller using Model Method
	 * 
	 * Example is Given Below
	 */
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Rahul Singh");
		List<String> list=new ArrayList<String>();
		list.add("Rahul");
		list.add("Rakesh");
		list.add("Raghav");
		model.addAttribute("list",list);
		return "home";
	}
	@RequestMapping("/about")
	 public String about() {
		return "about";
	}
	/*
	 * Pass the Value from controller to view using ModelAndView method
	 * Example is given
	 */
	
	@RequestMapping(path="/contact",method=RequestMethod.GET)
	public ModelAndView contact() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("name","Rahul");
		List<String> list=new ArrayList<String>();
		list.add("Rahul");
		list.add("Rakesh");
		list.add("Raghav");
		mv.addObject("list",list);
		mv.setViewName("contact");
		return mv;
	}
	/*
	 * Method one to handle the form value to the Controller
	 * Request Httpservlet Request
	 */
	@RequestMapping(path="/contact",method=RequestMethod.POST)
	public String contactUse(HttpServletRequest req) {
		System.out.println("Contact Form Submit");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		System.out.println("Name  is :"+name+" Email is :"+email+" Password :"+pass);
		return "contact";
	}
	
	/*
	 * 2nd Method to handel the form to the Controller
	 * using @RequestParam 
	 */
	
	@RequestMapping(path="/contact1",method=RequestMethod.POST)
	public String contactUse1(
			@RequestParam("name") String uname,
			@RequestParam("email") String uemail,
			@RequestParam("pass") String upass
			) {
		
		System.out.println("Name  is :"+uname+" Email is :"+uemail+" Password :"+upass);
		
		return "contact";
	}
	/*
	 * 3rd Method to handle the form controller using
	 * modelAttribute
	 */
	@RequestMapping(path="/contact2",method=RequestMethod.POST)
	public String contactUse2(@ModelAttribute contact cont) {
		System.out.println(cont.toString());
		return "contact";
	}
	
}
