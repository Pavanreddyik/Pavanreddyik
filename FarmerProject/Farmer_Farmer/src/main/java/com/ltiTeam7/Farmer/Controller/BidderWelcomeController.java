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

import com.ltiTeam7.Farmer.Entity.BidderWelcome;
import com.ltiTeam7.Farmer.Services.BidderWelcomeServicesImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/welcome")
public class BidderWelcomeController {
	@Autowired
	
	BidderWelcomeServicesImpl Service8;
	
	   //http://localhost:8197/welcome/welcomes
		@GetMapping("/welcomes")
		public List<BidderWelcome> listAllCropType()
		{
			
			return Service8.listAllCropType();
		}

		//http://localhost:8197/welcome/welcomes
		@GetMapping("/welcomes/{id}")
		public BidderWelcome findByCropType(@PathVariable(value="id") String cropType)
		{
		return Service8.findBidderWelcomeByCropType(cropType);
		}
		
		//http://localhost:8197/welcome/addnewwelcome
		@PostMapping("/addnewwelcome")
		public void adds(@RequestBody BidderWelcome w) {
			Service8.addCropType(w);
			
		}

}
