package com.mexchange.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "transactions")
public class Transaction {
    private User user;
    private User.Recipient recipient;
    Date date;
    String originCurrency;
    String targetCurrency;
    BigDecimal amount;
    BigDecimal exchangeRate;
    String status;
}
