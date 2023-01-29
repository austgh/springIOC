package com.ahzx.entity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GhDemo {
	private String name;
	public GhDemo(String name){
		this.name=name;
	}
	public GhDemo(){
		log.info("this is empty menthod!!!");
	}
	public void say(){
		log.info("my name is "+name);
	}

	@Override
	public String toString() {
		return "GhDemo{" +
				"name='" + name + '\'' +
				'}';
	}
}
