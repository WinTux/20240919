package com.pepe.p20240919.Tags;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class Card2Tag extends SimpleTagSupport {
	StringWriter sw = new StringWriter();
	public void doTag() throws JspException, IOException 
	{
		getJspBody().invoke(sw);
		JspWriter out = getJspContext().getOut();
		out.println("<div class='display-2'>El valor es: "+sw.toString()+"</div>");
	}
}
