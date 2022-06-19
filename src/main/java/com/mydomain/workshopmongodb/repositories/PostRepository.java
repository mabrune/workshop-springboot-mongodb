package com.mydomain.workshopmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.workshopmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
