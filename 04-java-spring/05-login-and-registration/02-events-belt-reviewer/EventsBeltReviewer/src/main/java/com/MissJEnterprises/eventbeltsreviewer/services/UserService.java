package com.MissJEnterprises.eventbeltsreviewer.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MissJEnterprises.eventbeltsreviewer.models.User;
import com.MissJEnterprises.eventbeltsreviewer.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository uRepo;
	
																		//Register A New User
	public User registerUser(User user) {
																		//Generate aHash
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
																		//Set the Hashed password on the user's pw field
		user.setPassword(hash);
																		//Save the new user and their password to the db
		return this.uRepo.save(user);
	}
	
																		//Authenticate User Login
	public boolean authenticateUser(String email, String password) {
																		//make sure the user logging in is who they say they are
																		//1 - query for the user by email address
		User user = this.uRepo.findByEmail(email);
		if(user == null) {
				return false;
		}
																		//2 = check the provided password associated with that email
		return BCrypt.checkpw(password, user.getPassword());
	}
	
																		//look up a user by the email
	public User getByEmail(String email) {
			return this.uRepo.findByEmail(email);
			
	}
	
																		//look up a user by ID
	public User getSingleUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
		
	}
	
	public User findById(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	

	
	
	
}

