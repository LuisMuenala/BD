package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.distribuida.entities.Estudiantes;


public class EstudiantesDAOImpl implements EstudiantesDAO {

	private SessionFactory sessionFactory;
	@Override
	public List<Estudiantes> findAll() {
		// TODO Auto-generated method stub
		session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Autor",Estudiantes.class).getResultList();
	}

	@Override
	public Autor findOne(int id) {
		return null;
		
	}
	
	

	@Override
	public void add(Autor autor){

	}

	@Override
	public void up(Autor Autor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}
}