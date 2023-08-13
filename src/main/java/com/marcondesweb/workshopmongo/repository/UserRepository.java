package com.marcondesweb.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.marcondesweb.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
    



    
}
