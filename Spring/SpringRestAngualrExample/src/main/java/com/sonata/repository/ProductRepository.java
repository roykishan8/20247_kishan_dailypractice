package com.sonata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sonata.model.Product;
@Service
@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
	
}


