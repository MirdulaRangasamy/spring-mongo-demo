package com.exterro.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exterro.mongo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
