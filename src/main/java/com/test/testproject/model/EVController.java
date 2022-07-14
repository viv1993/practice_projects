package com.test.testproject.model;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ev")
public class EVController {

	@RequestMapping("/chargers")
	@ResponseBody
	public List<Charger> getChargerList(@RequestParam Integer locationId) {
		return null;
	}
	
}
