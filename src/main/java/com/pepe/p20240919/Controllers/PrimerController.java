package com.pepe.p20240919.Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
/**
 * Servlet implementation class PrimerController
 */
public class PrimerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		//out.append("BLABLABLA");
		String nombre = request.getParameter("usuario");
		String correo = request.getParameter("email");
		String llave = (String) request.getAttribute("llave");
		out.println("<html><h1>Hola querido "+ nombre  + " (" + correo +") [GET]</h1></html>");
		
		HttpSession sesion = request.getSession();
		sesion.setAttribute("un_parametro", "Este es un valor de sesion");
		response.sendRedirect("segundo");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("[POST] Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String nombre = request.getParameter("usuario");
		String correo = request.getParameter("email");
		out.println("<html><h1>Hola querido "+ nombre  + " (" + correo +") [POST]</h1></html>");
	}

}
