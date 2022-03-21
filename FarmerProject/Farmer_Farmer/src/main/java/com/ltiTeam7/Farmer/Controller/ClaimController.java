package com.ltiTeam7.Farmer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltiTeam7.Farmer.Entity.Claim;
import com.ltiTeam7.Farmer.Services.ClaimServicesImpl;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/claim")
public class ClaimController {
	@Autowired
	
	ClaimServicesImpl Service7;
	
	   //http://localhost:8197/claim/claims
		@GetMapping("/claims")
		public List<Claim> listAllClaim()
		{
			
			return Service7.listAllClaim();
		}

		//http://localhost:8197/claim/claims
		@GetMapping("/farmers/{id}")
		public Claim findByPolicyNo(@PathVariable(value="id") long policyNo)
		{
		return Service7.findClaimByPolicyNo(policyNo);
		}
		
		//http://localhost:8197/claim/addnewclaim
		@PostMapping("/addnewfarmer")
		public void adds(@RequestBody Claim c) {
			Service7.addPolicyNo(c);
			
		}

}
