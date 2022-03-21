package com.ltiTeam7.Farmer.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bidderwelcome")
public class BidderWelcome {
	@Id
	@Column(name="cropType")
	private String cropType;
	 
	@Column(name="cropName")
	private String cropName;
	 
	@Column(name="basePrice")
	private long basePrice;
	 
	@Column(name="currentBid")
	private long currentBid;
	
	public BidderWelcome() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BidderWelcome(String cropType, String cropName, long basePrice, long currentBid) {
		super();
		this.cropType = cropType;
		this.cropName = cropName;
		this.basePrice = basePrice;
		this.currentBid = currentBid;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public long getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(long basePrice) {
		this.basePrice = basePrice;
	}

	public long getCurrentBid() {
		return currentBid;
	}

	public void setCurrentBid(long currentBid) {
		this.currentBid = currentBid;
	}

	@Override
	public String toString() {
		return "BidderWelcome [cropType=" + cropType + ", cropName=" + cropName + ", basePrice=" + basePrice
				+ ", currentBid=" + currentBid + "]";
	}
	
	
	
	

}
