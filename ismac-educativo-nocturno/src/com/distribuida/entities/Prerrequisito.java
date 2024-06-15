package com.distribuida.entities;
 
public class Prerrequisito {
 
	
	private int idPrerrequisito;
	private String numcurso;
	//----------------------------------------
	private Curso curso;
	private String numprerrequisito;
	
	public Prerrequisito () {}
 
	public Prerrequisito(int idPrerrequisito, String numcurso, String numprerrequisito) {
 
		this.idPrerrequisito = idPrerrequisito;
		this.numcurso = numcurso;
		this.numprerrequisito = numprerrequisito;
	}
 
	public int getIdPrerrequisito() {
		return idPrerrequisito;
	}
 
	public void setIdPrerrequisito(int idPrerrequisito) {
		this.idPrerrequisito = idPrerrequisito;
	}
 
	public String getNumcurso() {
		return numcurso;
	}
 
	public void setNumcurso(String numcurso) {
		this.numcurso = numcurso;
	}
 
	public String getNumprerrequisito() {
		return numprerrequisito;
	}
 
	public void setNumprerrequisito(String numprerrequisito) {
		this.numprerrequisito = numprerrequisito;
	}
 
	@Override
	public String toString() {
		return "Prerrequisito [idPrerrequisito=" + idPrerrequisito + ", numcurso=" + numcurso + ", numprerrequisito="
				+ numprerrequisito + "]";
	}
	
	
	
	
}