package com.marcondesweb.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.marcondesweb.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
    

}
