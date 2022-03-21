package com.ltiTeam7.Farmer.Services;

import java.util.List;

import com.ltiTeam7.Farmer.Entity.BidderWelcome;

public interface BidderWelcomeServices {
	
	public abstract String addCropType(BidderWelcome w);

	public abstract  BidderWelcome findBidderWelcomeByCropType(String cropType);

	public abstract List< BidderWelcome> listAllCropType();

	public String updateCropType(String cropType);

	public abstract String deleteByCropType(String cropType);
	

}
