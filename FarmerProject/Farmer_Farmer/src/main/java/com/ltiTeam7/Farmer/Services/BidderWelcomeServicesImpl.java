package com.ltiTeam7.Farmer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltiTeam7.Farmer.Dao.BidderWelcomeDao;
import com.ltiTeam7.Farmer.Entity.BidderWelcome;
import com.ltiTeam7.Farmer.Entity.Farmer;
@Service("Service8")
public class BidderWelcomeServicesImpl implements BidderWelcomeServices{
	@Autowired
	BidderWelcomeDao dao8;
	
	
	
	public BidderWelcomeDao getDao8() {
		return dao8;
	}

	public void setDao8(BidderWelcomeDao dao8) {
		this.dao8 = dao8;
	}

	@Override
	public String addCropType(BidderWelcome w) {
		// TODO Auto-generated method stub
		System.out.println("Service layer");
		  String cropType= dao8.addCropType(w);
		  return cropType;
	}

	@Override
	public BidderWelcome findBidderWelcomeByCropType(String cropType) {
		// TODO Auto-generated method stub
		BidderWelcome w= dao8.findBidderWelcomeByCropType(cropType);
		return w;
	}

	@Override
	public List<BidderWelcome> listAllCropType() {
		// TODO Auto-generated method stub
		List<BidderWelcome> welcomeList=dao8.listAllCropType();
		return welcomeList ;
	}

	@Override
	public String updateCropType(String cropType) {
		// TODO Auto-generated method stub
		String wn=dao8.updateCropType(cropType);
		return wn;
	}

	@Override
	public String deleteByCropType(String cropType) {
		// TODO Auto-generated method stub
		String w=dao8.deleteByCropType(cropType);
		return w;
	}

}
