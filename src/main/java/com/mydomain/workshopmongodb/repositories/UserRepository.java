package com.mydomain.workshopmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
