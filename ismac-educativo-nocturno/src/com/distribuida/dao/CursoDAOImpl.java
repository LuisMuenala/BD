package com.distribuida.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.distribuida.entities.Curso;

public class CursoDAOImpl implements CursoDAO {
	private SessionFactory sessionFactory;
	
	
	
	@Override
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Curso",Curso.class).getResultList();
	}

	@Override
	public Curso findOne(int id) {
		return null;
		
	}
	
	

	@Override
	public void add(Curso autor){

	}

	@Override
	public void up(Curso estudiante) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
