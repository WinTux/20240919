package com.pepe.p20240919.Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Login_Verifica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login_Verifica() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u = request.getParameter("user");
		String p = request.getParameter("pass");
		if(u.equals("Pepe")&& p.equals("123456")) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuario", u);
			response.sendRedirect("login_bienvenido.jsp");
		}else
			response.sendRedirect("login_login.jsp");
	}

}
