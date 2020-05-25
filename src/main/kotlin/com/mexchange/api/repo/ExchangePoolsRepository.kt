package com.mexchange.api.repo

import com.mexchange.api.entity.ExchangePool
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "exchangePools", path = "exchangePools")
interface ExchangePoolsRepository: MongoRepository<ExchangePool, String>
