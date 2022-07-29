package org.model2.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model2.dao.BoardDao;
import org.model2.dto.Board1;

public class BoardViewCommend implements ExcuteCommend {

	@Override
	public void ExcuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no"));
		String url ="";
		BoardDao dao = BoardDao.getInstance();
		Board1 boardView = dao.boardView(no);
		
		if(boardView!=null) {
			url= "/boardView.jsp";
			request.setAttribute("boardView", boardView);
		}else {
			url = "boardListView.bo";
		}
		request.setAttribute("url", url);
	}

}
