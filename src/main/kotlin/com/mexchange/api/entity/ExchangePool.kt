package com.mexchange.api.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal


@Document(collection = "exchangePools")
data class ExchangePool(
    @Id var id: String? = null,
    var name: String? = null,
    var firstCurrency: CurrencyPool? = null,
    var secondCurrency: CurrencyPool? = null,
    var rate: Rate? = null
) {

    data class CurrencyPool (
        var currency: String? = null,
        var availableAmount: BigDecimal? = null
    )

    data class Rate (
        var currency: String? = null,
        var amount: BigDecimal? = null
    )
}
