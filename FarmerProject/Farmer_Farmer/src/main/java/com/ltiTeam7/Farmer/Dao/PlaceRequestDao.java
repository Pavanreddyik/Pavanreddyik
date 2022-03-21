package com.ltiTeam7.Farmer.Dao;

import java.util.List;

import com.ltiTeam7.Farmer.Entity.Farmer;
import com.ltiTeam7.Farmer.Entity.PlaceRequest;

public interface PlaceRequestDao {
	public abstract String addPlaceRequest(PlaceRequest p);

	public abstract PlaceRequest findPlaceRequestBycropType(String cropType);

	public abstract List<PlaceRequest> listAllPlaceRequest();

	public String updatecrop(String cropType,String cropname);

	public abstract String deleteByCropType(String cropType);

}
