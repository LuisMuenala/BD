package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Estudiantes;

public interface EstudiantesDAO {

public List<Estudiantes> findAll();
	
	public Estudiantes findOne(int id);
	
	public void add(Estudiantes estudiantes);
	
	public void up(Estudiantes estudiante);
	
	public void delete(int id);
}

