package com.springcore.collection.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;



public class Person {

	private List<String> friend;
	
	private Map<String,Integer> fee;
	
	private Properties properties;

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}

	public Map<String, Integer> getFee() {
		return fee;
	}

	public void setFee(Map<String, Integer> fee) {
		this.fee = fee;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [friend=" + friend + ", fee=" + fee + ", properties=" + properties + "]";
	}

	
	
	

}
