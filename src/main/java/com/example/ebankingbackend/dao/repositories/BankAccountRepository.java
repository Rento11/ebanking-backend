package com.example.ebankingbackend.dao.repositories;

import com.example.ebankingbackend.dao.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
