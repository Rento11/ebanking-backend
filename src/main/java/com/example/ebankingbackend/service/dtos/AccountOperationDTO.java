package com.example.ebankingbackend.service.dtos;

import com.example.ebankingbackend.dao.enums.OperationType;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
public class AccountOperationDTO {
    private Integer id;
    private Date operationDate;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    private String description;
}
