package com.bmj.exam.vo;

public class Genre {
	private int no;
	private String name;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Genre() {
		// TODO Auto-generated constructor stub
	}
	
	public Genre(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "번호 : "+no+" / 장르명 : "+name;
	}
}
