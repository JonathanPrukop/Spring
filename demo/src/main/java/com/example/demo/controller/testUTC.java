package com.example.demo.controller;

import java.time.Instant;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class testUTC {
	
	@Autowired
	DemoController control = new DemoController();
	
	@Test
	public void contextLoads() {
		assert(control != null);
	}
	
	//This test starts with a println to initialize program and lower risk of time desync.
	//Due to said time desync risk when the test fails run it twice to see if it fails twice.
	//If it does not fail a second time, it passed but the time of the test sample and the demo program desynced once.
	//If it fails multiple times in a row, then it is a coding error.
	@Test
	public void test() {
		System.out.println(Instant.now().toString());
		assert(control.displayUTC().equals(Instant.now().toString()));
	}

}
