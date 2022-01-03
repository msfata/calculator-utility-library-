package com.rest.jpa.simple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.jpa.simple.entities.Business;

public interface AppRepository extends JpaRepository<Business, Long> {

}
