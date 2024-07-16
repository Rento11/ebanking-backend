package com.example.ebankingbackend.dao.repositories;

import com.example.ebankingbackend.dao.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Integer> {
}
