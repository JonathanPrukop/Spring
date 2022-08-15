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
		assert(control.displayHomePage().equals("Welcome Home!\nGo to localhost:8080/UTC to see the current UTC.\nSend a valid java timezone id via get request to localhost:8080/UserTime to recieve your current time"));
	}
	
}
