package com.callor.student.model;



public class StudentVO {

	private String strNum; // 학번
	private String strName; // 학생이름
	private String strDepartment; // 학과
	private String strLevel; // 학년
	private String strclass; // 반
	private String strAddress; // 주소
	private String strCall; // 전화번호

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentVO(String strNum, String strName, String strDepartment, String strLevel, String strclass,
			String strAddress, String strCall) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.strDepartment = strDepartment;
		this.strLevel = strLevel;
		this.strclass = strclass;
		this.strAddress = strAddress;
		this.strCall = strCall;
	}

	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrDepartment() {
		return strDepartment;
	}

	public void setStrDepartment(String strDepartment) {
		this.strDepartment = strDepartment;
	}

	public String getStrLevel() {
		return strLevel;
	}

	public void setStrLevel(String strLevel) {
		this.strLevel = strLevel;
	}

	public String getStrclass() {
		return strclass;
	}

	public void setStrclass(String strclass) {
		this.strclass = strclass;
	}

	public String getStrAddress() {
		return strAddress;
	}

	public void setStrAddress(String strAddress) {
		this.strAddress = strAddress;
	}

	public String getStrCall() {
		return strCall;
	}

	public void setStrCall(String strCall) {
		this.strCall = strCall;
	}

	@Override
	public String toString() {
		return "StudentVO [strNum=" + strNum + ", strName=" + strName + ", strDepartment=" + strDepartment
				+ ", strLevel=" + strLevel + ", strclass=" + strclass + ", strAddress=" + strAddress + ", strCall="
				+ strCall + "]";
	}

}
