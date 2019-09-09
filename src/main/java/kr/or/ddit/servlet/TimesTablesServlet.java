package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimesTablesServlet extends HttpServlet {
	
	   private static final Logger logger = LoggerFactory.getLogger(TimesTablesServlet.class);
	
	   @Override
	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  
		  //System.out.println("TimesTablesServlet doGet()");
		   String method = req.getMethod();
		   
	      logger.trace("trace TimesTablesServlet doGet() {} {}", method, method);
		  logger.debug("debug TimesTablesServlet doGet() {}", method);
		  logger.info("info TimesTablesServlet doGet()");
		  logger.warn("warn TimesTablesServlet doGet()");
		  logger.error("error TimesTablesServlet doGet()");
		  
	      resp.setContentType("text/html; charset = UTF-8");
	      
	      PrintWriter pw =  resp.getWriter();
	      pw.println("<html>");	
	      pw.write("   <head>");
	      pw.write("      <title>구구단</title>");
	      pw.write("   	  <style>");
	      pw.write("           table {");	
	      pw.write("           		border-collapse:collapse;");	
	      pw.write("           		width:700px;");	
	      pw.write("           		height:350px;");	
	      pw.write("           		text-align : center;");	
	      pw.write("           }");	
	      pw.write("           td {");	
	      pw.write("           		border-spacing:10px;");	
	      pw.write("           }");	
	      pw.write("      </style>");
	      pw.write("   </head>");
	      pw.write("   <body>");
	      pw.write("      <table border=1>");
	      for(int i = 1; i < 10; i++) {
	    	  pw.write("<tr>");
	    	  for(int j = 2; j < 10; j++) {
	    		  pw.write("<td>" + j + " * " + i + " = " + j*i + "</td>");
	    	  }
	    	  pw.write("</tr>");
	      }
	      pw.write("   </body>");
	      pw.write("</html>");
	   }
}
