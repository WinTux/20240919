package com.pepe.p20240919.Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name="abc", urlPatterns="/segundo", initParams= {@WebInitParam(name="prueba", value="algo")})
public class SegundoController extends HttpServlet  {

	private static final long serialVersionUID = -2927264012557866762L;
	public SegundoController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String parametro = request.getParameter("prueba");
		out.println("<html><h1>Parametro inicial: "+ parametro  +") </h1></html>");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Lineas de codigo haciendo algo
		RequestDispatcher rd = request.getRequestDispatcher("ejemplo1");
		rd.forward(request, response);
	}
}
