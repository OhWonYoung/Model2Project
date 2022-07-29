package org.model2.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.model2.dao.Model2Dao;

public class LoginCommend implements ExcuteCommend{

	@Override
	public void ExcuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String url = "";
		Model2Dao dao = Model2Dao.getInstance();
		int loginOk = dao.loginDo(userId, userPw);

		if(loginOk!=1) {
			System.out.println("로그인 실패");
			url = "index.do";
		}else {
			System.out.println("로그인 성공");
			if(userId.equals("admin") && userPw.equals("1111")) {
				// 로그인을 할 때 권한을준다.
				System.out.println("관리자 권한");
				session.setMaxInactiveInterval(60*30);
				session.setAttribute("admin", "ADMIN_ROLE");
				session.setAttribute("sessionId", userId);
			}else {
				System.out.println("일반 권한");
				session.setMaxInactiveInterval(60*10);
				session.setAttribute("user", "USER_ROLE");
				session.setAttribute("sessionId", userId);
				
			}
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
