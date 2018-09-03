package com.example.RRCSpringfoxDoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.RRCSpringfoxDoc.entity.MyTestBean;

@RepositoryRestResource
public interface MyTestRepository extends JpaRepository<MyTestBean, Integer>{

}
