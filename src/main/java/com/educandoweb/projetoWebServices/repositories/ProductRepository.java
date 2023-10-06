package com.educandoweb.projetoWebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projetoWebServices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	

}
