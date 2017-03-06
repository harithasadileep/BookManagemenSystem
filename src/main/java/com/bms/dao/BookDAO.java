package com.bms.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bms.Entities.BooksEntity;


public interface BookDAO extends JpaRepository<BooksEntity, Serializable>{

}
