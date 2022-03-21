package com.ltiTeam7.Farmer.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.ltiTeam7.Farmer.Dao.FarmerDao;
import com.ltiTeam7.Farmer.Entity.Farmer;


@Repository
public class FarmerDaoImpl implements FarmerDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public long addFarmer(Farmer f) {
		em.persist(f);
		return f.getFarmerId();
		// TODO Auto-generated method stub
	
	}

	@Override
	public Farmer findFarmerById(String farmerId) {
		// TODO Auto-generated method stub
		Farmer f=em.find(Farmer.class,farmerId);
		return f;
	}

	@Override
	public List<Farmer> listAllFarmer() {
		// TODO Auto-generated method stub
		String sql="Select f From Farmer f";
		Query qry=em.createQuery(sql);
		List<Farmer> farmerList=qry.getResultList();
		return farmerList;
	}

	@Override
	@Transactional
	public String updateName(String farmerId, String Name) {
		// TODO Auto-generated method stub
		Farmer user =em.find(Farmer.class,farmerId);
		user.setName(Name);
		em.merge(user);
		return user.getName();
	}

	@Override
	@Transactional
	public long deleteById(String farmerId) {
		// TODO Auto-generated method stub
		Farmer f=em.find(Farmer.class,farmerId);
		 em.remove(f);
		return f.getFarmerId();
	}
	
	
}
