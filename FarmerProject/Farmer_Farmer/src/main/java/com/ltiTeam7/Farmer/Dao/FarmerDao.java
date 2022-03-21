package com.ltiTeam7.Farmer.Dao;

import java.util.List;

import com.ltiTeam7.Farmer.Entity.Farmer;

public interface FarmerDao {
	
public abstract long addFarmer(Farmer f);

public abstract Farmer findFarmerById(String farmerId);

public abstract List<Farmer> listAllFarmer();

public String updateName(String farmerId,String Name);

public abstract long deleteById(String farmerId);

}