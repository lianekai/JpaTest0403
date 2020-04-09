package com.lianyikai.jpatest.dao;

import com.lianyikai.jpatest.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

}

