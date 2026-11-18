package com.vinipaiva.workshopmongo.repository;

import com.vinipaiva.workshopmongo.domain.Post;
import com.vinipaiva.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
