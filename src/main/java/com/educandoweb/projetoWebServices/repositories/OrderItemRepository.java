package com.educandoweb.projetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projetoWebServices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	

}
