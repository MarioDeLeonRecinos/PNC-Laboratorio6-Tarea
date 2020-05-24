package com.mario.capas.tarea6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mario.capas.tarea6.dao.ImportanciaDAO;
import com.mario.capas.tarea6.domain.Importancia;

@Service
public class ImportanciaServiceImpl implements ImportanciaService {
	@Autowired
	ImportanciaDAO importanciaDao;

	@Override
	public List<Importancia> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return importanciaDao.findAll();
	}

}
