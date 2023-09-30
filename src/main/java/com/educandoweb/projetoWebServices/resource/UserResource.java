package com.educandoweb.projetoWebServices.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.projetoWebServices.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "maria", "maria@gmail.com", "119999", "senha");
		return ResponseEntity.ok().body(u);
	}

}
