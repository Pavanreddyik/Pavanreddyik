package com.ltiTeam7.Farmer.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ltiTeam7.Farmer.Entity.Claim;


@Repository
public class ClaimDaoImpl implements ClaimDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public long addPolicyNo(Claim c) {
		// TODO Auto-generated method stub
		em.persist(c);
		return c.getPolicyNo();
	}

	@Override
	public Claim findClaimByPolicyNo(long policyNo) {
		// TODO Auto-generated method stub
		Claim c=em.find(Claim.class,policyNo);
		return c;
	}

	@Override
	public List<Claim> listAllClaim() {
		// TODO Auto-generated method stub
		String sql="Select c From Claim c";
		Query qry=em.createQuery(sql);
		List<Claim> claimList=qry.getResultList();
		return claimList;
	}

	@Override
	@Transactional
	public long updatePolicyNo(long policyNo) {
		// TODO Auto-generated method stub
		Claim user7 =em.find(Claim.class,policyNo);
		user7.setPolicyNo(policyNo);
		em.merge(user7);
		return user7.getPolicyNo();
	}

	@Override
	@Transactional
	public long deleteByPolicyNo(long policyNo) {
		// TODO Auto-generated method stub
		Claim c=em.find(Claim.class,policyNo);
		 em.remove(c);
		return c.getPolicyNo();
	}


}
