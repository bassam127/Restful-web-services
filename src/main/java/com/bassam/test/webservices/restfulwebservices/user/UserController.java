package com.bassam.test.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {

	@Autowired
	private UserDao userDaoservice;

	@GetMapping("/users")
	public List<User> getAllUser() {
		return userDaoservice.findAll();
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		User user = userDaoservice.findUserById(id);
		if(user == null) {
			throw new UserNotFoundException("can not found user with id "+id);
		}
		return user;
	}

	@PostMapping("/user")
	public ResponseEntity<Object> createUser(@RequestBody User user) {

		User savedUser = userDaoservice.addUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(savedUser).toUri();
		
		return ResponseEntity.created(location).build();
	}
}
