package com.mexchange.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "exchangePools")
public class ExchangePool {
    @Id
    private String id;

    private String name;

    private CurrencyPool firstCurrency;
    private CurrencyPool secondCurrency;

    private Rate rate;

    @NoArgsConstructor
    @Getter
    @Setter
    public static class CurrencyPool {
        private String currency;
        private BigDecimal availableAmount;
    }

    @NoArgsConstructor
    @Getter
    @Setter
    public static class Rate {
        private String currency;
        private BigDecimal amount;
    }
}
