package com.MissJEnterprises.eventbeltsreviewer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MissJEnterprises.eventbeltsreviewer.models.Event;
import com.MissJEnterprises.eventbeltsreviewer.models.User;
import com.MissJEnterprises.eventbeltsreviewer.repositories.EventRepository;
import com.MissJEnterprises.eventbeltsreviewer.repositories.UserRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eRepo;
	
	@Autowired
	private UserRepository uRepo;
	
	public EventService(EventRepository repo) {
		this.eRepo = repo;
		
	}
	
																	//get all events
	public List<Event> getAllEvents(){
		return this.eRepo.findAll();
		
	}
																	//get one event
	public Event getSingleEvent(Long id) {
		return this.eRepo.findById(id).orElse(null);
	}
	
	
																	//create event
	public Event createEvent(Event newEvent) {
		return this.eRepo.save(newEvent);
		
	}
		
	
																	//edit event
	public void updateEvent(Event event) {
		this.eRepo.save(event);
		
	}
		
	
																	//delete event
	public void delete(Long id) {
		this.eRepo.deleteById(id);
		
	}
	

	public void addGuest(User user, Event event) {
		List<User> guests = event.getGuests();
		guests.add(user);
		this.eRepo.save(event);
}


	public void removeGuest(User user, Event event) {
		List<User> guests = event.getGuests();
		guests.remove(user);
		this.eRepo.save(event);
}

	
	
	
	
	
	
}
