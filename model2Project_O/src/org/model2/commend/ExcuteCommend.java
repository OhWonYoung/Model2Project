package org.model2.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ExcuteCommend {

	void ExcuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException;
}
