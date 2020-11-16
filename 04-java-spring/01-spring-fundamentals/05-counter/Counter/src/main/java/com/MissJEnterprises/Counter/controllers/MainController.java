package com.MissJEnterprises.Counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	private int getSessionCount(HttpSession countSession) {
		Object sessionVal = countSession.getAttribute("count");
		if(sessionVal == null) {
				setSessionCount(countSession, 0);
				sessionVal = countSession.getAttribute("count");
		}
		return (Integer)sessionVal;
	}
	private void setSessionCount(HttpSession setSession, int val) {
		setSession.setAttribute("count", val);
	}
	
	@RequestMapping("/")
	public String index(HttpSession home) {
		int currCount = getSessionCount(home);
		setSessionCount(home, ++currCount);
		return "index.jsp";
	}
		
		@RequestMapping("/reset")
		public String reset(HttpSession r) {
			r.invalidate();
			return "redirect:/counter";
		}
		@RequestMapping("/counter")
		public String counter(HttpSession s, Model model) {
			model.addAttribute("count", getSessionCount(s));
			return "counter.jsp";
		}
		@RequestMapping("/counterbytwo")
		public String counterTwo(HttpSession s, Model model) {
			model.addAttribute("count", getSessionCount(s) * 2);
			return "counter.jsp";
		}
}
