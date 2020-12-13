package com.MissJEnterprises.validators;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.MissJEnterprises.authentication.models.User;
import com.MissJEnterprises.authentication.repositories.UserRepository;

@Component
public class UserValidator {
	
	@Autowired
	private UserRepository uRepo;

	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
		
	}
	

	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			errors.rejectValue("passwordConfirmation", "Match");
		}
		
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "This email has already been registered");
		}

	}

	


}
