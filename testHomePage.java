package com.example.demo.controller;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class testHomePage {
	
	
	@Autowired
	DemoController control = new DemoController();
	
	@Test
	public void contextLoads() {
		assert(control != null);
	}
	
	@Test
	public void test() {		
		assert(control.displayHomePage().equals("Welcome Home!"));
	}
	
}
