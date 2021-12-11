package com.technoelevate.MyApp.Controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.technoelevate.myBeans.EmployeeDTO;

@Controller
public class MyFirstController {
	
	
	@RequestMapping(path="/hello",method=RequestMethod.GET)
	public ModelAndView getHello() {
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("/WEB-INF/Views/Hello.jsp");
		modelAndView.setViewName("Hello");
		return modelAndView;
	}
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public ModelAndView getHome(ModelAndView modelAndView) {
		//modelAndView.setViewName("/WEB-INF/Views/HomePage.jsp");
		modelAndView.setViewName("HomePage");
		return modelAndView;
	}
	
	@RequestMapping(path="/search",method=RequestMethod.GET)
	public ModelAndView search(HttpServletRequest req, ModelAndView modelAndView) {
		String id =req.getParameter("id");
		modelAndView.addObject("myId",id);
		//modelAndView.setViewName("/WEB-INF/Views/search.jsp");
		modelAndView.setViewName("search");
		return modelAndView;
	}
	
	//@RequestMapping(path="/doSearch",method=RequestMethod.GET)
	@GetMapping(path="/doSearch")
	public String doSearch(HttpServletRequest req, ModelMap map) {
		String id = req.getParameter("id");
		map.addAttribute("myId",id);
		return "search";
	}
	
	@GetMapping("/login")
	public String myLogin(ModelMap map) {
		return "MyLoginForm";
	}
	
	
	@PostMapping(path="/loginPage")
	public String myLoginOne(HttpServletRequest request, ModelMap map) {
		String empId =  request.getParameter("empId");
		String userName= request.getParameter("user");
		String password = request.getParameter("passkey");
		
		map.addAttribute("myEmpId",empId);
		map.addAttribute("myUserName",userName);
		map.addAttribute("myPassword",password);
	
		return "UserDetails";
	}//first way to get the form data.
	
	
	
	@PostMapping("/loginPage2")
	public String myLoginTwo( ModelMap map, 
			@RequestParam("empId") String id,
			@RequestParam("user") String uname,
			@RequestParam("passkey") String password) {
		
		map.addAttribute("myEmpId",id);
		map.addAttribute("myUserName",uname);
		map.addAttribute("myPassword",password);
		return "UserDetails";
	}//2nd way of fetching the data.
	
	@PostMapping("/loginPage3")
	public String myLoginThree( ModelMap map,String empId,	 String user,String passkey) {
		
		map.addAttribute("myEmpId",empId);
		map.addAttribute("myUserName",user);
		map.addAttribute("myPassword",passkey);
		return "UserDetails";
	}//3rd way of fetching the data.

	
	@PostMapping("/loginPage4")
	public String myLoginFour(ModelMap map,EmployeeDTO emp,HttpServletRequest req) {
		emp.setEmpId(req.getParameter("empId"));
		emp.setUserName(req.getParameter("user"));
		emp.setPassword(req.getParameter("passkey"));
		map.addAttribute("myEmpObj",emp);
		return "UserData";
	}//4th way of fetching the data

}
