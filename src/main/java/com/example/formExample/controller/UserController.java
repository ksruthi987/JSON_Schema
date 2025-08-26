package com.example.formExample.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.formExample.entity.User;
import com.example.formExample.repo.*;

//import jakarta.validation.Valid;
//import jakarta.validation.constraints.Positive;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//@CrossOrigin(origins = "http://localhost:5500")

//@CrossOrigin(origins = "http://127.0.0.1:5500") 

//@CrossOrigin(origins = {"http://127.0.0.1:5500", "http://localhost:5500"}

//In your controller or a global config
@CrossOrigin(origins = "*") // allow all domains

@RestController
//@Validated
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@PostMapping("/users")
	public ResponseEntity<User> postMethod(  @RequestBody User user) {
		return new ResponseEntity<>(userRepo.save(user),HttpStatus.CREATED);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getMethod() {
		return new ResponseEntity<>(userRepo.findAll(),HttpStatus.OK);
		
	}
	
	@GetMapping("/users/{registrationNo}")
	public ResponseEntity<User> getMethodById(@PathVariable long registrationNo){
		Optional<User> user=userRepo.findById(registrationNo);
		if(user.isPresent())
		{
			return new ResponseEntity<>(user.get(),HttpStatus.OK);
			
		}
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/users/{registrationNo}")
	public ResponseEntity<User> putMethod(@PathVariable  long registrationNo, @RequestBody User user1 ) {
		Optional<User> user=userRepo.findById(registrationNo);
		if(user.isPresent())
		{
			user.get().setNameOfTheStudent(user1.getNameOfTheStudent());
			user.get().setFatherName(user1.getFatherName());
			user.get().setAddress(user1.getAddress());
			user.get().setDateOfBirth(user1.getDateOfBirth());
			user.get().setDepartment(user1.getDepartment());
			user.get().setEmail(user1.getEmail());
			user.get().setMobileNo(user1.getMobileNo());
			user.get().setNameOfTheInstitute(user1.getNameOfTheInstitute());
			return new ResponseEntity<>(userRepo.save(user.get()),HttpStatus.OK);
			
		}
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		//return "Edit the data";
	}
	
	@DeleteMapping("/users/{registrationNo}")
	public ResponseEntity<User> deleteMethod(@PathVariable  long registrationNo) {
		Optional<User> user=userRepo.findById(registrationNo);
		if(user.isPresent())
		{
			userRepo.deleteById(registrationNo);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		//return "User Deleted";
		
	}
	
	
}
