package com.koreaIT.java.am;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home/gugudan")
public class gugudanServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		String inputDan = request.getParameter("dan");
		String inputLimit = request.getParameter("limit");
		
		int dan = Integer.parseInt(inputDan); 
		int limit = Integer.parseInt(inputLimit);
		
		
		response.getWriter().append(String.format("== %d ==\n", dan));
		for ( int i = 1; i <= limit; i ++) {
			response.getWriter().append(String.format("&d * %d = &d\n", dan, i, dan * i));
		}
		
	}
	

}