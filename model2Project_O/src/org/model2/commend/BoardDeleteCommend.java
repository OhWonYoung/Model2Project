package org.model2.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model2.dao.BoardDao;

public class BoardDeleteCommend implements ExcuteCommend{

	@Override
	public void ExcuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url ="";
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDao dao = BoardDao.getInstance();
		int boardDelete = dao.boardDelete(no);
		
		if(boardDelete!=1) {
			url ="boardView.bo?no="+no;
		}else {
			url = "boardListView.bo";
		}
		request.setAttribute("url", url);
		
	}
}
