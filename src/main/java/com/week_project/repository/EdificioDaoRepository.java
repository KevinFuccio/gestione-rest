package com.week_project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.week_project.model.Edificio;



@Repository
public interface EdificioDaoRepository extends CrudRepository<Edificio,Long> {

}
