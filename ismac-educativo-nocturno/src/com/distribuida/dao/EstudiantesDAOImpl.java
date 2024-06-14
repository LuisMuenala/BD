package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Estudiantes;

@Repository
public class EstudiantesDAOImpl implements EstudiantesDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Estudiantes> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Estudiantes",Estudiantes.class).getResultList();
	}

	@Override
	public Estudiantes findOne(int id) {
		return null;
		
	}
	
	

	@Override
	public void add(Estudiantes estudiantes){

	}

	@Override
	public void up(Estudiantes estudiantes) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}
}
