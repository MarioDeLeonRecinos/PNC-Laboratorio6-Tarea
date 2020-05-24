package com.mario.capas.tarea6.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mario.capas.tarea6.domain.Importancia;

public interface ImportanciaDAO {
	
	public List<Importancia> findAll() throws DataAccessException;

	public Importancia findOne(Integer code) throws DataAccessException;
}
