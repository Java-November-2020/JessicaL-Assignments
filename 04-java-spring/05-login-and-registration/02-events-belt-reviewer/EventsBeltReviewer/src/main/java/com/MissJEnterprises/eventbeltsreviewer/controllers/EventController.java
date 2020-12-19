package com.MissJEnterprises.eventbeltsreviewer.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.MissJEnterprises.eventbeltsreviewer.models.Event;
import com.MissJEnterprises.eventbeltsreviewer.models.User;
import com.MissJEnterprises.eventbeltsreviewer.services.EventService;
import com.MissJEnterprises.eventbeltsreviewer.services.UserService;

@Controller
public class EventController {

	@Autowired
	private EventService eService;
	
	@Autowired 
	private UserService uService;
	
	
	
																					//display all events on the dashboard
	@GetMapping("/dashboard")
	public String listEvents(@ModelAttribute("event") Event event, Model viewModel, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");

		if(userId == null) {
			return "redirect:/";
		}
		User user = this.uService.getSingleUser((Long)session.getAttribute("user_id"));
		List<Event> allEvents = this.eService.getAllEvents();
		viewModel.addAttribute("allEvents", allEvents);
		viewModel.addAttribute("user", user);
		return "events.jsp";
		}

	@PostMapping("/dashboard")
	public String createEvent(@Valid @ModelAttribute("event") Event event, @ModelAttribute("user") User user, Model model, BindingResult result, HttpSession session) {
		if(result.hasErrors()) {
			return "events.jsp";
		}
			Long userId = (Long)session.getAttribute("user_id");
			User userCreatedEvent = this.uService.getSingleUser(userId);
			event.setPlanner(userCreatedEvent);
			this.eService.createEvent(event);
			return "redirect:/dashboard";
	}
	
	@GetMapping("/event/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel, HttpSession session) {
		viewModel.addAttribute("event", this.eService.getSingleEvent(id));
		return "show.jsp";
	}

	@GetMapping("/attend/{id}")
	public String join(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		Long eventId = id;
		User guest = this.uService.getSingleUser(userId);
		Event  joinedEvent = this.eService.getSingleEvent(eventId);
		this.eService.addGuest(guest, joinedEvent);
		return "redirect:/dashboard";
	}
	
			//process the unlike click, no page loads
	@GetMapping("/dontattend/{id}")
	public String removeGuest(@PathVariable("id") Long id, HttpSession session) {
			Long userId = (Long)session.getAttribute("user_id");
			Long eventId = id;
			User guest = this.uService.getSingleUser(userId);
			Event  joinedEvent = this.eService.getSingleEvent(eventId);
			this.eService.removeGuest(guest, joinedEvent);
			return "redirect:/dashboard";
		}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.eService.delete(id);
		return "dashboard.jsp";
	}
	
	
	
	
	
}
