package org.nuc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.nuc.dao.IWorkDao;
import org.nuc.dao.impl.WorkDaoImpl;

public class UpdateWorkOvertime extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		int id = (int)session.getAttribute("workid");
		int overtime = (int)session.getAttribute("workovertime");
		int salary = (int)session.getAttribute("worksalary");
		IWorkDao addemployee = new WorkDaoImpl();
		boolean result = addemployee.UpdateOvertimeByID(id, overtime,salary);
		if(result) {
			out.print("加班确认成功！");
			out.print("<br><a href=\"attendance.jsp\" target=\"show\"><font size=\"4\">退出</font></a>");
		}else {
			out.print("加班确认失败！");
			out.print("<br><a href=\"attendance.jsp\" target=\"show\"><font size=\"4\">退出</font></a>");
		}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
