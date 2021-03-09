package com.com.iolist.model;

public class IoVO {

	private String strdate; // 걸래 일자
	private String strproductName; // 상품명
	private String strTrader; // 거래처
	private String strCeo; // 대표자명
	private int division; // 구분
	private int buyPrice; // 매입 단가
	private int sellPrice; // 판매 단가
	private int intQty; // 수량
	private int buyTotalPrice; // 매입 총금액
	private int sellTotalPrice;

	public String getStrdate() {
		return strdate;
	}

	public void setStrdate(String strdate) {
		this.strdate = strdate;
	}

	public String getStrproductName() {
		return strproductName;
	}

	public void setStrproductName(String strproductName) {
		this.strproductName = strproductName;
	}

	public String getStrTrader() {
		return strTrader;
	}

	public void setStrTrader(String strTrader) {
		this.strTrader = strTrader;
	}

	public String getStrCeo() {
		return strCeo;
	}

	public void setStrCeo(String strCeo) {
		this.strCeo = strCeo;
	}

	public int getDivision() {
		return division;
	}

	public void setDivision(int division) {
		this.division = division;
	}

	public int getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	public int getIntQty() {
		return intQty;
	}

	public void setIntQty(int intQty) {
		this.intQty = intQty;
	}

	public int getBuyTotalPrice() {
		return buyTotalPrice;
	}

	public void setBuyTotalPrice(int buyTotalPrice) {
		this.buyTotalPrice = buyTotalPrice;
	}

	public int getSellTotalPrice() {
		return sellTotalPrice;
	}

	public void setSellTotalPrice(int sellTotalPrice) {
		this.sellTotalPrice = sellTotalPrice;
	}

	@Override
	public String toString() {
		return "IoVO [strdate=" + strdate + ", strproductName=" + strproductName + ", strTrader=" + strTrader
				+ ", strCeo=" + strCeo + ", division=" + division + ", buyPrice=" + buyPrice + ", sellPrice="
				+ sellPrice + ", intQty=" + intQty + ", buyTotalPrice=" + buyTotalPrice + ", sellTotalPrice="
				+ sellTotalPrice + "]";
	}

}
