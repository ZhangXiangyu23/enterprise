package org.nuc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nuc.dao.IStudyDao;
import org.nuc.dao.impl.StudyDaoImpl;
import org.nuc.entity.Study;


public class DoAddStudy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String starttime = request.getParameter("starttime");
		String endtime = request.getParameter("endtime");
		String content = request.getParameter("content");

		Study study = new Study(id,starttime,endtime,content);
		IStudyDao studyimpl = new StudyDaoImpl();
		boolean result = studyimpl.addStudy(study);
		if(result) {
			out.print("添加成功！");
			out.print("<br><a href=\"study.jsp\" target=\"show\"><font size=\"4\">退出</font></a>");
		}else {
			out.print("添加失败！");
			out.print("<br><a href=\"study.jsp\" target=\"show\"><font size=\"4\">退出</font></a>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
