package org.model2.commend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model2.dao.BoardDao;
import org.model2.dto.Board1;

public class BoardListViewCommend implements ExcuteCommend{

	@Override
	public void ExcuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "";
		BoardDao dao = BoardDao.getInstance();
		ArrayList<Board1> boardList = dao.boardListView();
		
		if(boardList!=null) {
			url ="/boardListView.jsp";
			request.setAttribute("boardList", boardList);
		}else {
			url ="index.do";
		}
		
		request.setAttribute("url", url);
	}
}
