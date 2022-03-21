package com.ltiTeam7.Farmer.Dao;

import java.util.List;

import com.ltiTeam7.Farmer.Entity.Claim;



public interface ClaimDao {
	
	public abstract long addPolicyNo(Claim c);

	public abstract Claim findClaimByPolicyNo(long policyNo);

	public abstract List<Claim> listAllClaim();

	public long updatePolicyNo(long policyNo);

	public abstract long deleteByPolicyNo(long policyNo);

}
