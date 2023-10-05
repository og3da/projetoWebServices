package com.educandoweb.projetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projetoWebServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	

}
