package com.educandoweb.projetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projetoWebServices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	

}
