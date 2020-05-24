package com.mario.capas.tarea6.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mario.capas.tarea6.domain.Contribuyente;

public interface ContribuyenteDAO {
	
	public List<Contribuyente> findAll() throws DataAccessException;

	public Contribuyente findOne(Integer code) throws DataAccessException;
	
	public void save(Contribuyente contribuyente) throws DataAccessException;
}
