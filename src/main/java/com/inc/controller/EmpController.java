package com.inc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inc.service.IEmpService;


@Controller
public class EmpController {

	 @Autowired
	private IEmpService empService;
	 
	
	 public IEmpService getEmpService() {
		return empService;
	}


	public void setEmpService(IEmpService empService) {
		this.empService = empService;
	}


	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public String getEmpDetails(Model model){
	     model.addAttribute("listEmployees", this.empService.listEmployees());		
		return "employee";
	}
	/* public ModelAndView getAllUser(Model m)
		{
			m.addAttribute("userList", userService.getAllUsers());
			return new ModelAndView("dispAllUsers","model",m);
		}*/
		
}
