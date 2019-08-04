package com.codefountain.spring.core.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionHolder {
	
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, String> myMap;
	
	private List<Player> myPlayers;
	
	private Properties properties;
	
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Set<String> getMySet() {
		return mySet;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public Map<String, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	public List<Player> getMyPlayers() {
		return myPlayers;
	}
	public void setMyPlayers(List<Player> myPlayers) {
		this.myPlayers = myPlayers;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	

}
