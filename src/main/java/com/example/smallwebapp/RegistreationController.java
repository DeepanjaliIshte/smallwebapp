package com.example.smallwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegistreationController {
	@RequestMapping("/regform")
	public String register()
	{
		
		return "registration";
	}
	
	/*
	 * @RequestMapping("/userdetails") public ModelAndView userInfo(UserRegistration
	 * reg) { ModelMap model=new ModelMap();
	 * model.addAttribute("name",reg.getName()); model.addAttribute("emailID",
	 * reg.getEmailID()); //model.addAttribute("gender",reg.getGender());
	 * model.addAttribute("gender",reg.getGender()==Integer.parseInt("1")?"Male" :
	 * "Female"); model.addAttribute("hobby", reg.getHobby());
	 * 
	 * ModelAndView mv = new ModelAndView("userdetails"); mv.addObject("regObj" ,
	 * reg); return mv ; }
	 */
	
	@RequestMapping("/userDetails")
	public String userInfo(UserRegistration reg)
	{
		repo.save(reg);
		return "operation";
	}
	
	@RequestMapping("/operation")
	public String operation(Long UId,String ddlFlag)
	{
		if(ddlFlag.equals("select")) {
			UserRegistration reg=repo.findById(UId).orElse(new UserRegistration()); 
				ModelMap model=new ModelMap();
					  model.addAttribute("name",reg.getName()); model.addAttribute("emailID",
					  reg.getEmailID()); 
					 model.addAttribute("gender",reg.getGender()==Integer.parseInt("1")?"Male" :
					 "Female"); model.addAttribute("hobby", reg.getHobby());
					 
					 ModelAndView mv = new ModelAndView("userdetails");
					 mv.addObject("regObj" , reg);
					 }
			System.out.println(ddlFlag);
		}
		else if(ddlFlag.equals("delete")) {
			repo.deleteById(UId);
		}
		else if(ddlFlag.equals("update")) {
			UserRegistration reg=repo.findById(UId).orElse(new UserRegistration());
			reg.setName("xyz_updated_name");
			repo.save(reg);
		}
		else {}
		return "operation";
	}
}
