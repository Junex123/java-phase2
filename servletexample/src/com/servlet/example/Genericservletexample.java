package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Genericservletexample
 */
@WebServlet("/Genericservletexample")
public class Genericservletexample extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Genericservletexample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String basic = request.getParameter("mname");
		response.setContentType("text/html");
		PrintWriter pObj= response.getWriter();
		pObj.print("<html><body>");
		pObj.print("Name:" +basic+ "<BR>");
		pObj.print("</body></html>");
		
	}

}
