package org.model2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.model2.dbConnect.DBConnect;

public class Model2Dao {

	private static final Model2Dao INSTANCE = new Model2Dao();
	private Model2Dao () {}
	public static Model2Dao getInstance() {
		return INSTANCE;
	}
	
	public int insertDo(String userId, String userPw, String userName) {
		int rs = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into member1 values(?,?,?)";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			
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
	public int loginDo(String userId, String userPw) {
		int loginOk = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member1 where userId=? and userPw=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				loginOk = rs.getInt(1);
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
		return loginOk;
	}
	
	
	
}
