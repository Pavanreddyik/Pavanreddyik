package com.ltiTeam7.Farmer.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ltiTeam7.Farmer.Entity.Farmer;
import com.ltiTeam7.Farmer.Entity.PlaceRequest;

@Repository
public class PlaceRequestDaoImpl implements PlaceRequestDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public String addPlaceRequest(PlaceRequest p) {
		// TODO Auto-generated method stub
		em.persist(p);
		return p.getCropType();
		
	}

	@Override
	public PlaceRequest findPlaceRequestBycropType(String cropType) {
		// TODO Auto-generated method stub
		PlaceRequest p=em.find(PlaceRequest.class,cropType);
		return p;
	}

	@Override
	public List<PlaceRequest> listAllPlaceRequest() {
		// TODO Auto-generated method stub
		String sql="Select p From PlaceRequest p";
		Query qry=em.createQuery(sql);
		List<PlaceRequest> placeRequestList=qry.getResultList();
		return placeRequestList;
	}

	@Override
	@Transactional
	public String updatecrop(String cropType, String cropname) {
		// TODO Auto-generated method stub
		PlaceRequest crop =em.find(PlaceRequest.class,cropType);
		crop.setCropName(cropname);
		em.merge(crop);
		return crop.getCropName();
	}

	@Override
	@Transactional
	public String deleteByCropType(String cropType) {
		// TODO Auto-generated method stub
		PlaceRequest p=em.find(PlaceRequest.class,cropType);
		 em.remove(p);
		return p.getCropType();
	}

}
