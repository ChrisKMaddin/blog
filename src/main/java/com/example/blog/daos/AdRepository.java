package com.example.blog.daos;

import com.example.blog.models.Ad;
import org.springframework.data.repository.CrudRepository;

public interface AdRepository extends CrudRepository<Ad, Long> {
}