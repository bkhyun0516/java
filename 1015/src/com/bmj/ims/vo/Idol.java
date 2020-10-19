package com.bmj.ims.vo;

import java.sql.Date;

public class Idol {
	private char gender;
	private int idolId, groupId;
	private Double height, weight;
	private String name,groupName;
	private Date birthDate;
	public char getGender() {
		return gender;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getIdolId() {
		return idolId;
	}
	public void setIdolId(int idolId) {
		this.idolId = idolId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Idol() {
		// TODO Auto-generated constructor stub
	}
	
	public Idol(int idolId, String name) {
		super();
		this.idolId = idolId;
		this.name = name;
	}
	public Idol(String name) {
		super();
		this.name = name;
	}
	public Idol(char gender, int groupId, Double height, Double weight, String name, Date birthDate) {
		this.gender = gender;
		this.groupId = groupId;
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return idolId + ") "+ name +
			   " / 키 : "+ height +
			   " / 몸무게 : "+ weight +
			   " / 생년월일 : "+ birthDate +
			   " / 성별 : "+ gender +
			   " / 그룹번호 : "+ groupId;
	}
	
}
