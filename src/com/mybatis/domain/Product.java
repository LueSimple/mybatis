package com.mybatis.domain;

public class Product {
	
	private int  proID;
	
	private String proName;
	
	private int proNo;
	
	private String proPic;
	
	private int CID;
	
	private double proPrice;
	
	private String proDetail;

	public Product() {
		super();
	}

	public Product(int proID, String proName, int proNo, String proPic, int cID, double proPrice, String proDetail) {
		super();
		this.proID = proID;
		this.proName = proName;
		this.proNo = proNo;
		this.proPic = proPic;
		CID = cID;
		this.proPrice = proPrice;
		this.proDetail = proDetail;
	}

	public int getProID() {
		return proID;
	}

	public void setProID(int proID) {
		this.proID = proID;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProNo() {
		return proNo;
	}

	public void setProNo(int proNo) {
		this.proNo = proNo;
	}

	public String getProPic() {
		return proPic;
	}

	public void setProPic(String proPic) {
		this.proPic = proPic;
	}

	public int getCID() {
		return CID;
	}

	public void setCID(int cID) {
		CID = cID;
	}

	public double getProPrice() {
		return proPrice;
	}

	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}

	public String getProDetail() {
		return proDetail;
	}

	public void setProDetail(String proDetail) {
		this.proDetail = proDetail;
	}

	@Override
	public String toString() {
		return "Product [proID=" + proID + ", proName=" + proName + ", proNo=" + proNo + ", proPic=" + proPic + ", CID="
				+ CID + ", proPrice=" + proPrice + ", proDetail=" + proDetail + "]";
	}
	
	
	
	

}
