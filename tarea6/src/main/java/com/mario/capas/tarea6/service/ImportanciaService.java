package com.mario.capas.tarea6.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.mario.capas.tarea6.domain.Importancia;

public interface ImportanciaService {

	public List<Importancia> findAll() throws DataAccessException;

}
