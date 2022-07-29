package org.model2.dto;

public class Board1 {

	private int no;
	private String userId;
	private String userPw;
	private String title;
	private String content;

	public Board1(int no, String userId, String userPw, String title, String content) {
		super();
		this.no = no;
		this.userId = userId;
		this.userPw = userPw;
		this.title = title;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
