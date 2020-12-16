package com.mxchange.midrate.api.repo

import com.mxchange.midrate.api.entity.ExchangePool
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "exchangePools", path = "exchangePools")
interface ExchangePoolsRepository: MongoRepository<ExchangePool, String>
