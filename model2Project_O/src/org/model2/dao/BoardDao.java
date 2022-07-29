package org.model2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.model2.dbConnect.DBConnect;
import org.model2.dto.Board1;

public class BoardDao {

	private static final BoardDao INSTANCE = new BoardDao();
	private BoardDao() {};
	public static BoardDao getInstance() {
		return INSTANCE;
	}
	
	public int boardWrite(String userId, String userPw, String title, String content) {
		int rs = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into board1 values(sequnece_board1_no.NEXTVAL,?,?,?,?)";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, title);
			pstm.setString(4, content);
			
			rs = pstm.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		return rs;
	}
	public ArrayList<Board1> boardListView() {
		ArrayList<Board1> boardList = new ArrayList<Board1>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from board1 order by no desc";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String userId = rs.getString(2);
				String userPw = rs.getString(3);
				String title = rs.getString(4);
				String content = rs.getString(5);
				
				boardList.add(new Board1(no, userId, userPw, title, content));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		return boardList;
	}
	public Board1 boardView(int no) {
		Board1 boardView = null;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from board1 where no=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, no);
			
			rs= pstm.executeQuery();
			
			
			if(rs.next()) {

				int no1 = rs.getInt(1);
				String userId = rs.getString(2);
				String userPw = rs.getString(3);
				String title = rs.getString(4);
				String content = rs.getString(5);
				
				boardView = new Board1(no1, userId, userPw, title, content);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		return boardView;
	}
	public int boardDelete(int no) {
		int boardDelete = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "delete board1 where no=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, no);
			
			boardDelete = pstm.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		
		return boardDelete;
	}
	public int maxNo() {
		int maxNo= 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select max(no)+1 from board1";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				maxNo = rs.getInt(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		return maxNo;
	}
	
}
