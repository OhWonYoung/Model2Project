package org.model2.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model2.dao.Model2Dao;

import com.sun.media.sound.EmergencySoundbank;

public class JoinOkCommend implements ExcuteCommend{

	@Override
	public void ExcuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
		String url ="";
		Model2Dao dao = Model2Dao.getInstance();
		int rs = dao.insertDo(userId, userPw, userName);
		
		if(rs!=1) {
			url = "index.do";
		}else {
			url = "loginView.do";
		}
		
		request.setAttribute("url", url);
	}
}
