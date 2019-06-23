package com.todoapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.todoapp.model.MainModel;

public interface MainRepo extends CrudRepository<MainModel, Long> {

	
}
