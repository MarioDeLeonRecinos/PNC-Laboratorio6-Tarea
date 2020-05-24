package com.mario.capas.tarea6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mario.capas.tarea6.dao.ContribuyenteDAO;
import com.mario.capas.tarea6.domain.Contribuyente;

@Service
public class ContribuyenteServiceImpl implements ContribuyenteService{
	
	@Autowired
	ContribuyenteDAO contribuyenteDao;
	
	@Override
	public List<Contribuyente> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return contribuyenteDao.findAll();
	}



	@Override
	public void save(Contribuyente contribuyente) throws DataAccessException {
		// TODO Auto-generated method stub
		contribuyenteDao.save(contribuyente);
	}

}
