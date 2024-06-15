package com.distribuida.entities;

public class Seccion {
	private int idSeccion;
	private String nSeccion;
	private String numCurso;
	private String semestre;
	private String año;
	private String profesor;
	
	private Curso curso;
	
	public Seccion() {}
	public Seccion(int idSeccion, String nSeccion, String numCurso, String semestre, String año, String profesor) {
		this.idSeccion = idSeccion;
		this.nSeccion = nSeccion;
		this.numCurso = numCurso;
		this.semestre = semestre;
		this.año = año;
		this.profesor= profesor;
	}
	public int getIdSeccion() {
		return idSeccion;
	}
	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}
	public String getnSeccion() {
		return nSeccion;
	}
	public void setnSeccion(String nSeccion) {
		this.nSeccion = nSeccion;
	}
	public String getNumCurso() {
		return numCurso;
	}
	public void setNumCurso(String numCurso) {
		this.numCurso = numCurso;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	@Override
	public String toString() {
		return "Seccion [idSeccion=" + idSeccion + ", nSeccion=" + nSeccion + ", numCurso=" + numCurso + ", semestre="
				+ semestre + ", año=" + año + ", profesor=" + profesor + "]";
	}
	
	
}
