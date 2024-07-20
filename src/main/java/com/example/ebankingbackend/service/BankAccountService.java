package com.example.ebankingbackend.service;

import com.example.ebankingbackend.dao.entities.BankAccount;
import com.example.ebankingbackend.dao.entities.CurrentAccount;
import com.example.ebankingbackend.dao.entities.Customer;
import com.example.ebankingbackend.dao.entities.SavingAccount;
import com.example.ebankingbackend.exceptions.BalanceNotSufficientException;
import com.example.ebankingbackend.exceptions.BankAccountNotFoundException;
import com.example.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    Customer saveCustomer(Customer customer);
    CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft, Integer customerId) throws CustomerNotFoundException;
    SavingAccount saveSavingBankAccount(double initialBalance, double interestRate, Integer customerId) throws CustomerNotFoundException;
    List<Customer> listCustomers();
    BankAccount getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccount> bankAccountList();
}
