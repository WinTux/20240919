package com.pepe.p20240919.Controllers;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EjemploSesionesController
 */
public class EjemploSesionesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    String var_sesion, var_contexto;
    public EjemploSesionesController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estamos en doGet()");
		PrintWriter out = response.getWriter();
		String nombre = request.getParameter("usuario");
		// Ejemplo de alcance de petición
		out.println("Alcance de petición: "+ nombre + "<br>");
		// Ejemplo de alcance de sesión
		HttpSession sesion = request.getSession();
		if(var_sesion == null)
			sesion.setAttribute("param_sesion", nombre);
		var_sesion = (String)sesion.getAttribute("param_sesion");
		out.println("Alcance de sesión: "+ var_sesion + "<br>");
		// Ejemplo de alcance de contexto
		ServletContext contexto = request.getSession().getServletContext();
		if(var_contexto == null)
			contexto.setAttribute("nom", nombre);
		var_contexto = (String)contexto.getAttribute("nom");
		out.println("Alcance de contexto: "+ var_contexto + "<br>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
