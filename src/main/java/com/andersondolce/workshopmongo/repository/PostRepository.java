package com.andersondolce.workshopmongo.repository;

import com.andersondolce.workshopmongo.domain.Post;
import com.andersondolce.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
