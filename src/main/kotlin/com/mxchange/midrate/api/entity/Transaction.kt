package com.mxchange.midrate.api.entity

import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal
import java.util.*

@Document(collection = "transactions")
data class Transaction (
    var user: User? = null,
    var recipient: User.Recipient? = null,
    var date: Date? = null,
    var originCurrency: String? = null,
    var targetCurrency: String? = null,
    var amount: BigDecimal? = null,
    var exchangeRate: BigDecimal? = null,
    var status: String? = null
)
