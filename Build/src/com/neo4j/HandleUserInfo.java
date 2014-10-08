package com.neo4j;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HandleUserInfo
 */
public class HandleUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	




	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
	      
		  
		  String[] mb = request.getParameterValues("PcBuilder");
		  res.setContentType("text/html");
	      PrintWriter out = res.getWriter();
		  String title = "Get User Input";
	      String docType =
	      "<!doctype html public \"-//w3c//dtd html 4.0 " +
	      "transitional//en\">\n";
	      for(String s : mb)
	      {
	      out.println(docType +
	                "<html>\n" +
	                "<head><title>" + title + "</title></head>\n" +
	                "<body bgcolor=\"#f0f0f0\">\n");
	      out.println("<li>" + s + "<li>");
	      }
	       out.println("<h1 align=\"center\">" + title + "</h1>\n" +
	       "</body></html>");
	      
	      if(mb == null) {
	    	  out.println("Motherboard is not selected");
	    	 
	      }else{
	    	  out.println("Motherboard is selected");
	  	  }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
	

	}

}
