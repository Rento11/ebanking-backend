package com.example.ebankingbackend.dao.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("SA")
//THE PREVIOUS ANNOTATION IS USED WHEN INHERITANCE TYPE EQUALS SINGLE_TABLE
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SavingAccount extends BankAccount{
    private double interestRate;
}
