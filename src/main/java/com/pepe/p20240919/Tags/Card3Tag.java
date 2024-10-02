package com.pepe.p20240919.Tags;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class Card3Tag extends SimpleTagSupport{
	StringWriter sw = new StringWriter();
	private String titulo, textoboton;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTextoboton(String textoboton) {
		this.textoboton = textoboton;
	}

	public void doTag() throws JspException, IOException 
	{
		if(titulo  != null) {
			if(textoboton == null)
				textoboton="ENVIAR";
			getJspBody().invoke(sw);
			JspWriter out = getJspContext().getOut();
			out.println("<div class=\"card\" style=\"width: 18rem;\">\n"
					+ "  <div class=\"card-body\">\n"
					+ "    <h5 class=\"card-title\">"+titulo+"</h5>\n"
					+ "    <p class=\"card-text\">"+sw.toString()+"</p>\n"
					+ "    <a href=\"#\" class=\"btn btn-primary\">"+textoboton+"</a>\n"
					+ "  </div>\n"
					+ "</div>");
		}
		
	}
}
