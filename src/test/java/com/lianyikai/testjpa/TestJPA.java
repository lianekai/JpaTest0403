package com.lianyikai.testjpa;

import com.lianyikai.jpatest.Application;
import com.lianyikai.jpatest.dao.CategoryDAO;
import com.lianyikai.jpatest.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestJPA {
    @Autowired
    CategoryDAO dao;

    @Test
    public void test() {
        List<Category> cs = dao.findAll();
        for (Category c : cs) {
            System.out.println("c.getName():" + c.getName());
        }

    }
}