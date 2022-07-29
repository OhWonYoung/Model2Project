package org.model2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model2.commend.ExcuteCommend;
import org.model2.commend.JoinOkCommend;
import org.model2.commend.LoginCommend;
import org.model2.commend.LogoutCommend;

@WebServlet("*.do")
public class Model2Controller extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String url ="";
		String basicURL = uri.substring(path.length()+1, uri.length()-3);
		ExcuteCommend commend = null;
		
		if(basicURL.equals("index")) {
			url = "/index.jsp";
		}else if(basicURL.equals("joinView")) {
			url = "/join.jsp";
		}else if(basicURL.equals("loginView")) {
			url = "/login.jsp";
		}else if(basicURL.equals("joinOk")) {
			commend = new JoinOkCommend();
			commend.ExcuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");
		}else if(basicURL.equals("loginOk")) {
			commend = new LoginCommend();
			commend.ExcuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");
		}else if(basicURL.equals("logoutOk")) {
			commend = new LogoutCommend();
			commend.ExcuteQueryCommend(request, response);
			url = (String) request.getAttribute("url");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}
}
