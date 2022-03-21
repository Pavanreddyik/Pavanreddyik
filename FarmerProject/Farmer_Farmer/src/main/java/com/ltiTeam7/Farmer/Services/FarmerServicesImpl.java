package com.ltiTeam7.Farmer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ltiTeam7.Farmer.Dao.FarmerDao;
import com.ltiTeam7.Farmer.Entity.Farmer;
@Service("Service")
public class FarmerServicesImpl implements FarmerServices {
	
	@Autowired
	FarmerDao dao;
	
	
	
	public FarmerDao getDao() {
		return dao;
	}


	public void setDao(FarmerDao dao) {
		this.dao = dao;
	}


	@Override
	public long addFarmer(Farmer f) {
		// TODO Auto-generated method stub
		 System.out.println("Service layer");
		  long farmerId= dao.addFarmer(f);
		  return farmerId;
	}
	

	@Override
	public Farmer findFarmerById(String farmerId) {
		// TODO Auto-generated method stub
		Farmer f= dao.findFarmerById(farmerId);
		return f;
		
	}

	@Override
	public List<Farmer> listAllFarmer() {
		// TODO Auto-generated method stub
		List<Farmer> farmerList=dao.listAllFarmer();
		return farmerList ;
	}

	@Override
	public String updateName(String farmerId, String Name) {
		// TODO Auto-generated method stub
		String fn=dao.updateName(farmerId,Name);
		return fn;
	}

	@Override
	public long deleteById(String farmerId) {
		// TODO Auto-generated method stub
		long f=dao.deleteById(farmerId);
		return f;
	}

	
}
