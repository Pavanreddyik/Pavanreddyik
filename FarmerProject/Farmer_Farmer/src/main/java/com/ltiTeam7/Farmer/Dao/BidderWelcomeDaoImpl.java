package com.ltiTeam7.Farmer.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ltiTeam7.Farmer.Entity.BidderWelcome;
import com.ltiTeam7.Farmer.Entity.Farmer;

@Repository
public class BidderWelcomeDaoImpl implements BidderWelcomeDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public String addCropType(BidderWelcome w) {
		// TODO Auto-generated method stub
		em.persist(w);
		return w.getCropType();
	}

	@Override
	public BidderWelcome findBidderWelcomeByCropType(String cropType) {
		// TODO Auto-generated method stub
		BidderWelcome w=em.find(BidderWelcome.class,cropType);
		return w;
	}

	@Override
	public List<BidderWelcome> listAllCropType() {
		// TODO Auto-generated method stub
		String sql="Select w From BidderWelcome w";
		Query qry=em.createQuery(sql);
		List<BidderWelcome> welcomeList=qry.getResultList();
		return welcomeList;
	}

	@Override
	@Transactional
	public String updateCropType(String cropType) {
		// TODO Auto-generated method stub
		BidderWelcome user8 =em.find(BidderWelcome.class,cropType);
		user8.setCropType(cropType);
		em.merge(user8);
		return user8.getCropType();
	}

	@Override
	@Transactional
	public String deleteByCropType(String cropType) {
		// TODO Auto-generated method stub
		BidderWelcome w=em.find(BidderWelcome.class,cropType);
		 em.remove(w);
		return w.getCropType();
	}

}
