package com.dsitribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CursoDAO;
import com.distribuida.entities.Curso;


public class PrincipalCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Patron de IoC - inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");//clase infraestructura de software
		
		CursoDAO cursoDAO = context.getBean("cursoDAOImpl", CursoDAO.class);
		
		
		List<Curso> curso = cursoDAO.findAll();
		curso.forEach(item -> {
			System.out.println(item.toString());
			
		});
		
		context.close();
	}
	

}
