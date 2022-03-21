package com.ltiTeam7.Farmer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltiTeam7.Farmer.Dao.PlaceRequestDao;
import com.ltiTeam7.Farmer.Entity.Farmer;
import com.ltiTeam7.Farmer.Entity.PlaceRequest;

@Service("Service4")
public class PlaceRequestServicesImpl implements PlaceReuestServices{

	@Autowired
	PlaceRequestDao dao;

	public PlaceRequestDao getDao() {
		return dao;
	}

	public void setDao(PlaceRequestDao dao) {
		this.dao = dao;
	}
	
	@Override
	public String addPlaceRequest(PlaceRequest p) {
		// TODO Auto-generated method stub
		 System.out.println("Service layer");
		  String cropType= dao.addPlaceRequest(p);
		  return cropType;
	}

	@Override
	public PlaceRequest findPlaceRequestBycropType(String cropType) {
		// TODO Auto-generated method stub
		PlaceRequest p= dao.findPlaceRequestBycropType(cropType);
		return p;
	}

	@Override
	public List<PlaceRequest> listAllPlaceRequest() {
		// TODO Auto-generated method stub
		List<PlaceRequest> placeRequestList=dao.listAllPlaceRequest();
		return placeRequestList ;
	}

	@Override
	public String updatecrop(String cropType, String cropname) {
		// TODO Auto-generated method stub
		String pn=dao.updatecrop(cropType,cropname);
		return pn;
	}

	@Override
	public String deleteByCropType(String cropType) {
		// TODO Auto-generated method stub
		String p=dao.deleteByCropType(cropType);
		return p;
	}
	
	

}
