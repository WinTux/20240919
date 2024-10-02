package com.pepe.p20240919.Filtros;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

/**
 * Servlet Filter implementation class EjemploFiltro
 */
public class EjemploFiltro extends HttpFilter implements Filter {
       
    public EjemploFiltro() {
        super();
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request2 = (HttpServletRequest) request;
		int e = Integer.parseInt(request2.getParameter("e"));
		if(e> 1 && e < 200)
			chain.doFilter(request, response);
		else
			response.getWriter().println("<html><h1>La edad es incorrecta!!!</h1></html>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
