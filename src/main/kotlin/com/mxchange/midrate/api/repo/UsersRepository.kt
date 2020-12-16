package com.mxchange.midrate.api.repo

import com.mxchange.midrate.api.entity.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
interface UsersRepository : MongoRepository<User, String>
