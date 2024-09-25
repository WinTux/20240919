package com.pepe.p20240919.Controllers;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class EjemploCookie2
 */
public class EjemploCookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploCookie2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] galletas = request.getCookies();
		for(Cookie c : galletas) {
			if(c.getName().equals("nombre")) {
				System.out.println("Cookie identificada: " + c.getValue());
			}
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Para el ejemplo de <context-param del web.xml>
		//ServletContext context = request.getServletContext();
		ServletContext context = getServletContext();
		String valor = context.getInitParameter("usu");
		response.getWriter().append("<br>").append(valor);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
