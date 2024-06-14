package com.dsitribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.persistence.Entity;


import com.distribuida.dao.EstudiantesDAO;
import com.distribuida.dao.EstudiantesDAO;
import com.distribuida.entities.Estudiantes;

public class PrincipalEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Patron de IoC - inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");//clase infraestructura de software
		
		EstudiantesDAO estudiantesDAO = context.getBean("estudiantesDAOImpl", EstudiantesDAO.class);
		//find all
		//control de inversion 
		List<Estudiantes> estudiantes = estudiantesDAO.findAll();
		estudiantes.forEach(item -> {
			System.out.println(item.toString());
			
		});
		
		context.close();
	}
	

}

