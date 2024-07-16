package com.example.ebankingbackend.dao.repositories;

import com.example.ebankingbackend.dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
