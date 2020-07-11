package org.nuc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.nuc.dao.IUserDao;
import org.nuc.dao.impl.UserDaoImpl;
import org.nuc.entity.User;


public class CheckUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");  
		response.setCharacterEncoding("utf-8"); 
		PrintWriter out = response.getWriter();
  
		User user = new User();
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setPassword(request.getParameter("password"));

		IUserDao userselect=new UserDaoImpl();
		User users = new User();
		users=userselect.queryCheckUser(user);
	    
	    if(users!=null) {
	    	HttpSession session=request.getSession();
	    	session.setAttribute("id",users.getId()); 
	    	session.setAttribute("type",users.getType()); 
	    	session.setAttribute("name", users.getName());
	    	response.sendRedirect("index.jsp");
	    }else {
	    	out.println("µÇÂ¼Ê§°Ü£¡");
	    }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
