package com.ltiTeam7.Farmer.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltiTeam7.Farmer.Dao.ClaimDao;
import com.ltiTeam7.Farmer.Entity.Claim;
import com.ltiTeam7.Farmer.Entity.Farmer;
@Service("Service9")
public class ClaimServicesImpl implements ClaimServices{
	
	@Autowired
	ClaimDao dao7;
	

	public ClaimDao getDao7() {
		return dao7;
	}

	public void setDao7(ClaimDao dao7) {
		this.dao7 = dao7;
	}

	@Override
	public long addPolicyNo(Claim c) {
		// TODO Auto-generated method stub
		 System.out.println("Service layer");
		  long policyNo= dao7.addPolicyNo(c);
		  return policyNo;
	}

	@Override
	public Claim findClaimByPolicyNo(long policyNo) {
		// TODO Auto-generated method stub
		Claim c= dao7.findClaimByPolicyNo(policyNo);
		return c;
		
	}

	@Override
	public List<Claim> listAllClaim() {
		// TODO Auto-generated method stub
		List<Claim> claimList=dao7.listAllClaim();
		return claimList ;
	}

	@Override
	public long updatePolicyNo(long policyNo) {
		// TODO Auto-generated method stub
		long cn=dao7.updatePolicyNo(policyNo);
		return cn;
	}

	@Override
	public long deleteByPolicyNo(long policyNo) {
		// TODO Auto-generated method stub
		long c=dao7.deleteByPolicyNo(policyNo);
		return c;
	}

}
