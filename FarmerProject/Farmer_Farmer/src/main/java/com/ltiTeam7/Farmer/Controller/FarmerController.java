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

import com.ltiTeam7.Farmer.Entity.Farmer;
import com.ltiTeam7.Farmer.Services.FarmerServicesImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/farmer")

public class FarmerController {
	@Autowired
	
	FarmerServicesImpl Service;
	
	   //http://localhost:8197/farmer/farmers
		@GetMapping("/farmers")
		public List<Farmer> listAllFarmer()
		{
			
			return Service.listAllFarmer();
		}

		//http://localhost:8197/farmer/farmers
		@GetMapping("/farmers/{id}")
		public Farmer findByFarmerId(@PathVariable(value="id") String farmerId)
		{
		return Service.findFarmerById(farmerId);
		}
		
		//http://localhost:8197/farmer/addnewfarmer
		@PostMapping("/addnewfarmer")
		public void adds(@RequestBody Farmer f) {
			Service.addFarmer(f);
			
		}

}
