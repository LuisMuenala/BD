package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Curso;

public interface CursoDAO {
	public List<Curso> findAll();
	
	public Curso findOne(int id);
	
	public void add(Curso autor);
	
	public void up(Curso estuiante);
	
	public void delete(int id);
}


