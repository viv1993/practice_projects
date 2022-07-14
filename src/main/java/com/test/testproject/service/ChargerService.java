package com.test.testproject.service;

import java.util.List;

import com.test.testproject.bean.BillingDetails;
import com.test.testproject.model.Charger;
import com.test.testproject.model.User;

public interface ChargerService {

	public List<Charger> getChargerList(Integer locationId);
	public void startCharging(User user);
	public BillingDetails endCharging(User user);
}
