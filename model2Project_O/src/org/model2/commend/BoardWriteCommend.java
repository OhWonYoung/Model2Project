package org.model2.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model2.dao.BoardDao;

public class BoardWriteCommend implements ExcuteCommend{

	@Override
	public void ExcuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url ="";
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		BoardDao dao = BoardDao.getInstance();
		int rs = dao.boardWrite(userId, userPw, title, content);
		
		if(rs!=1) {
			System.out.println("글작성 실패");
			url = "index.do";
		}else {
			System.out.println("글작성 성공");
			url = "boardListView.ao";
		}
		request.setAttribute("url", url);
	}
}
