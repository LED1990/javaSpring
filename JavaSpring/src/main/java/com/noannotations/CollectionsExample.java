package com.noannotations;

import java.util.*;

public class CollectionsExample {
	List exampleList;
	Map exampleMap;
	Set exampleSet;
	Properties exampleProp;
	public List getExampleList() {
		System.out.println("List Elements :"  + exampleList);
		return exampleList;
	}
	public void setExampleList(List exampleList) {
		this.exampleList = exampleList;
	}
	public Map getExampleMap() {
		System.out.println("Map Elements :"  + exampleMap);
		return exampleMap;
	}
	public void setExampleMap(Map exampleMap) {
		this.exampleMap = exampleMap;
	}
	public Set getExampleSet() {
		System.out.println("Set Elements :"  + exampleSet);
		return exampleSet;
	}
	public void setExampleSet(Set exampleSet) {
		this.exampleSet = exampleSet;
	}
	public Properties getExampleProp() {
		System.out.println("Properties Elements :"  + exampleProp);
		return exampleProp;
	}
	public void setExampleProp(Properties exampleProp) {
		this.exampleProp = exampleProp;
	}
	
	

}
