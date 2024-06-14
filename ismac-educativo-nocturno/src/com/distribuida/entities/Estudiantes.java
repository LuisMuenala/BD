package com.distribuida.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name= "estudinates")
@Component
public class Estudiantes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private int idEstudiantes;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "nEstudiante")
	private String nEstudiante;
	@Column(name = "clase")
	private String clase;
	@Column(name = "especialidad")
	private String especialidad;
	
	public Estudiantes() {}
	
	public Estudiantes(int idEstudiantes, String nombre, String nEstudiante, String clase, String especialidad) {
		this.idEstudiantes = idEstudiantes;
		this.nombre = nombre;
		this.nombre = nEstudiante;
		this.nombre = clase;
		this.nombre = especialidad;
	}

	public int getIdEstudiantes() {
		return idEstudiantes;
	}

	public void setIdEstudiantes(int idEstudiantes) {
		this.idEstudiantes = idEstudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getnEstudiante() {
		return nEstudiante;
	}

	public void setnEstudiante(String nEstudiante) {
		this.nEstudiante = nEstudiante;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Estudiantes [idEstudiantes=" + idEstudiantes + ", nombre=" + nombre + ", nEstudiante=" + nEstudiante
				+ ", clase=" + clase + ", especialidad=" + especialidad + "]";
	}
	
	
	
}
