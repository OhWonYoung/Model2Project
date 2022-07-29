package org.model2.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.model2.dao.BoardDao;

public class BoardMaxNoCommend implements ExcuteCommend{

	@Override
	public void ExcuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url ="";
		BoardDao dao = BoardDao.getInstance();
		int maxNo = dao.maxNo();
		
		if(maxNo>0) {
			url = "/boardWrite.jsp";
			request.setAttribute("maxNo", maxNo);
		}else {
			url = "index.do";
		}
		request.setAttribute("url", url);
	}
}
