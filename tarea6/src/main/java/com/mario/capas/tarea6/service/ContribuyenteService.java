package com.mario.capas.tarea6.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mario.capas.tarea6.domain.Contribuyente;

public interface ContribuyenteService {

	public List<Contribuyente> findAll() throws DataAccessException;

	public void save(Contribuyente contribuyente) throws DataAccessException;
}
