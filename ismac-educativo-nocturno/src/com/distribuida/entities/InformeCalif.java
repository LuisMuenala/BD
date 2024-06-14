package com.distribuida.entities;




public class InformeCalif {
	private int idInformeCalif;
	private String numEstudiante;
	//private String nSeccion;
	private Seccion seccion;
	
	private String nota;
	
	public InformeCalif(){}
	public InformeCalif(int idInformeCalif, String numEstudiante, String nota) {
		this.idInformeCalif = idInformeCalif;
		this.numEstudiante= numEstudiante;
		this.nota= nota;
		
	}
	public int getIdInformeCalif() {
		return idInformeCalif;
	}
	public void setIdInformeCalif(int idInformeCalif) {
		this.idInformeCalif = idInformeCalif;
	}
	public String getNumEstudiante() {
		return numEstudiante;
	}
	public void setNumEstudiante(String numEstudiante) {
		this.numEstudiante = numEstudiante;
	}
	
	
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "InformeCalif [idInformeCalif=" + idInformeCalif + ", numEstudiante=" + numEstudiante + ", nSeccion="
				 + ", nota=" + nota + "]";
	}
	
}
