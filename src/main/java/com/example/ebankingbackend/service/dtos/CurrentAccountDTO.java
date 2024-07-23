package com.example.ebankingbackend.service.dtos;

import com.example.ebankingbackend.dao.enums.AccountStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.Date;


@Data
public class CurrentAccountDTO  extends BankAccountDTO{
    private String id;
    private double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
}
