package com.pepe.p20240919.Tags;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class CardTag extends SimpleTagSupport {
	public void doTag() throws JspException, IOException 
	{
		JspWriter out = getJspContext().getOut();
		out.println("Texto simple");
	}
}
