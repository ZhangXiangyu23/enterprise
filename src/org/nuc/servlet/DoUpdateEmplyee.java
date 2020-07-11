package org.nuc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.nuc.dao.IEmployeeDao;
import org.nuc.dao.impl.EmployeeDaoImpl;
import org.nuc.entity.Employee;

public class DoUpdateEmplyee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		int id = (int)session.getAttribute("updateid");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String contect = request.getParameter("contect");
		String identity = request.getParameter("identity");
		String education = request.getParameter("education");
		String address = request.getParameter("address");
		String type = "employee";
		Employee employee = new Employee(password,name,sex, contect,identity, education,address ,type);
		IEmployeeDao addemployee = new EmployeeDaoImpl();
		boolean result = addemployee.UpdateEmployeerByID(id, employee);
		if(result) {
			out.print("修改成功！");
			out.print("<br><a href=\"personal.jsp\" target=\"show\"><font size=\"4\">退出</font></a>");
		}else {
			out.print("修改失败！");
			out.print("<br><a href=\"personal.jsp\" target=\"show\"><font size=\"4\">退出</font></a>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
