package com.mexchange.api.repo

import com.mexchange.api.entity.Transaction
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "transactions", path = "transactions")
interface TransactionRepository : MongoRepository<Transaction, String>
