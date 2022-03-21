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

import com.ltiTeam7.Farmer.Entity.PlaceRequest;
import com.ltiTeam7.Farmer.Services.FarmerServicesImpl;
import com.ltiTeam7.Farmer.Services.PlaceRequestServicesImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/placerequest")
public class PlaceRequestController {
	@Autowired
	
	PlaceRequestServicesImpl Service4;
	
	   //http://localhost:8197/placerequest/placerequests
		@GetMapping("/placerequests")
		public List<PlaceRequest> listAllPlaceRequest()
		{
			
			return Service4.listAllPlaceRequest();
		}

		//http://localhost:8197/placerequest/placerequests
		@GetMapping("/placerequests/{id}")
		public PlaceRequest findByFarmerId(@PathVariable(value="id") String cropType)
		{
		return Service4.findPlaceRequestBycropType(cropType);
		}
		
		//http://localhost:8197/placerequest/placerequests
		@PostMapping("/addnewplacerequest")
		public void adds(@RequestBody PlaceRequest p) {
			Service4.addPlaceRequest(p);
			
		}

}
