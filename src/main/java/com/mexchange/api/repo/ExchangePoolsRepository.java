package com.mexchange.api.repo;

import com.mexchange.api.entity.ExchangePool;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "exchangePools", path = "exchangePools")
public interface ExchangePoolsRepository extends MongoRepository<ExchangePool, String> {
    List<ExchangePool> findByName(String name);
    ExchangePool getByName(String name);
}