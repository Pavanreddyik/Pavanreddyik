package com.ltiTeam7.Farmer.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PlaceRequest")
public class PlaceRequest {
	@Id
	
	@Column(name="cropType")
	 private String cropType;
	@Column(name="cropName")
	 private String cropName;
	@Column(name="fertilizeType")
	 private String fertilizeType;
	@Column(name="quantity")
	 private String quantity;
	@Column(name="soilCertificate")
	 private String soilCertificate;
	
	public PlaceRequest(String cropType, String cropName, String fertilizeType, String quantity,
			String soilCertificate) {
		super();
		this.cropType = cropType;
		this.cropName = cropName;
		this.fertilizeType = fertilizeType;
		this.quantity = quantity;
		this.soilCertificate = soilCertificate;
	}
	 
	public PlaceRequest() {
		super();
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

	public String getFertilizeType() {
		return fertilizeType;
	}

	public void setFertilizeType(String fertilizeType) {
		this.fertilizeType = fertilizeType;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSoilCertificate() {
		return soilCertificate;
	}

	public void setSoilCertificate(String soilCertificate) {
		this.soilCertificate = soilCertificate;
	}

	@Override
	public String toString() {
		return "Place_Request [cropType=" + cropType + ", cropName=" + cropName + ", fertilizeType=" + fertilizeType
				+ ", quantity=" + quantity + ", soilCertificate=" + soilCertificate + "]";
	}


}
