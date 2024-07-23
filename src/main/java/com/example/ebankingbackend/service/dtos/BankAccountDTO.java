package com.example.ebankingbackend.service.dtos;

import com.example.ebankingbackend.dao.enums.AccountStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import java.util.Date;

@Data
public class BankAccountDTO {
    private String type;
}
