package com.ltiTeam7.Farmer.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claim")
public class Claim {
	 	@Id
		private long policyNo;
		private String insuranceCompany;
		private String insureeName;
		private String sumInsured;
		private String causeOfLoss;
		private String dateOfLoss;
		
		public Claim(long policyNo, String insuranceCompany, String insureeName, String sumInsured, String causeOfLoss,
				String dateOfLoss) {
			super();
			this.policyNo = policyNo;
			this.insuranceCompany = insuranceCompany;
			this.insureeName = insureeName;
			this.sumInsured = sumInsured;
			this.causeOfLoss = causeOfLoss;
			this.dateOfLoss = dateOfLoss;
		}

		public Claim() {
			super();
			// TODO Auto-generated constructor stub
		}

		public long getPolicyNo() {
			return policyNo;
		}

		public void setPolicyNo(long policyNo) {
			this.policyNo = policyNo;
		}

		public String getInsuranceCompany() {
			return insuranceCompany;
		}

		public void setInsuranceCompany(String insuranceCompany) {
			this.insuranceCompany = insuranceCompany;
		}

		public String getInsureeName() {
			return insureeName;
		}

		public void setInsureeName(String insureeName) {
			this.insureeName = insureeName;
		}

		public String getSumInsured() {
			return sumInsured;
		}

		public void setSumInsured(String sumInsured) {
			this.sumInsured = sumInsured;
		}

		public String getCauseOfLoss() {
			return causeOfLoss;
		}

		public void setCauseOfLoss(String causeOfLoss) {
			this.causeOfLoss = causeOfLoss;
		}

		public String getDateOfLoss() {
			return dateOfLoss;
		}

		public void setDateOfLoss(String dateOfLoss) {
			this.dateOfLoss = dateOfLoss;
		}

		@Override
		public String toString() {
			return "Claim [policyNo=" + policyNo + ", insuranceCompany=" + insuranceCompany + ", insureeName="
					+ insureeName + ", sumInsured=" + sumInsured + ", causeOfLoss=" + causeOfLoss + ", dateOfLoss="
					+ dateOfLoss + "]";
		}
		
		
		
		
}
