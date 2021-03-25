package com.palindrome.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.palindrome.test.bean.Bean;

public interface PalindromeRepository extends MongoRepository<Bean, String>{

}
