package com.ltiTeam7.Farmer.Services;

import java.util.List;

import com.ltiTeam7.Farmer.Entity.Claim;
import com.ltiTeam7.Farmer.Entity.Farmer;

public interface ClaimServices {
	
	public abstract long addPolicyNo(Claim c);

	public abstract Claim findClaimByPolicyNo(long policyNo);

	public abstract List<Claim> listAllClaim();

	public long updatePolicyNo(long policyNo);

	public abstract long deleteByPolicyNo(long policyNo);
}
