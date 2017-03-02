package com.spring.java.dependency.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsInjection {
	
	List<String> countries;
	Set<String> states;
	Map<String,String> cities;
	Properties addressProps;

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public Set<String> getStates() {
		return states;
	}

	public void setStates(Set<String> states) {
		this.states = states;
	}

	public Map<String, String> getCities() {
		return cities;
	}

	public void setCities(Map<String, String> cities) {
		this.cities = cities;
	}

	public Properties getAddressProps() {
		return addressProps;
	}

	public void setAddressProps(Properties addressProps) {
		this.addressProps = addressProps;
	}

	
}
