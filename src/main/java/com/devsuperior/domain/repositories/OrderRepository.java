package com.devsuperior.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
