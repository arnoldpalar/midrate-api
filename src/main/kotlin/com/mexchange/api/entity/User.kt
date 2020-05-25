package com.mexchange.api.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(
    @Id var id: String? = null,
    var details: Map<String, Any>? = null,
    var recipients: List<Recipient>? = null){

    data class Recipient(
        var fullName: String? = null,
        var country: String? = null,
        var bank: String? = null,
        var accountNumber: String? = null
    )
}
