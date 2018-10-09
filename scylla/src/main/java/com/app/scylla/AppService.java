package com.app.scylla;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppService {
	
	
	@GetMapping(value="/api/meaning")
	public String getListFiles() {
		
		return "The pair are negotiating for \"Scylla\", a card/disc of important Company data, and Whistler kills its current owner rather than pay for it. Before he and Gretchen can finish their operation, Michael arrives, planning to kill them as revenge for the death of Sara Tancredi (Sarah Wayne Callies).";
	}
	
}
