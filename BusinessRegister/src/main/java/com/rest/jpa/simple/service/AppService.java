package com.rest.jpa.simple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.jpa.simple.entities.Business;
import com.rest.jpa.simple.repository.AppRepository;

@Service
public class AppService {

	@Autowired
	private AppRepository repo;

	public Business saveRecord(Business records) {
		return repo.save(records);
	}

	public List<Business> readAll() {
		return repo.findAll();
	}

}
