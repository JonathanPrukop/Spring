package com.example.demo.controller;
import java.time.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

//All Tests (besides contextLoads) starts with a println to initialize program and lower risk of time desync.
//Due to said time desync risk when a test fails (besides contextLoads) run it twice to see if the same test fails twice.
//MAKE SURE IT IS THE SAME TEST FAILING
//If it does not fail a second time, it passed but the time of the test sample and the demo program desynced once.
//If it fails multiple times in a row, then it is a coding error.
public class testGetLocalTime {
	
	@Autowired
	DemoController control = new DemoController();
	
	@Test
	public void contextLoads() {
		assert(control != null);
	}
	
	@Test
	public void testNumberedName() {
		System.out.println(ZonedDateTime.now(ZoneId.of("CST6CDT")).toString());
		assert(control.getLocalTime("CST6CDT").equals(ZonedDateTime.now(ZoneId.of("CST6CDT")).toString()));
	}
	
	@Test
	public void testHyphenName() {
		System.out.println(ZonedDateTime.now(ZoneId.of("GB-Eire")).toString());
		assert(control.getLocalTime("GB-Eire").equals(ZonedDateTime.now(ZoneId.of("GB-Eire")).toString()));
	}
	

	@Test
	public void testOneWordName() {
		System.out.println(ZonedDateTime.now(ZoneId.of("Kwajalein")).toString());
		assert(control.getLocalTime("Cuba").equals(ZonedDateTime.now(ZoneId.of("Cuba")).toString()));
	}
	
	@Test
	public void testForwardSlashName() {
		System.out.println(ZonedDateTime.now(ZoneId.of("Indian/Antananarivo")).toString());
		assert(control.getLocalTime("Indian/Antananarivo").equals(ZonedDateTime.now(ZoneId.of("Indian/Antananarivo")).toString()));
	}
	
	
	@Test
	public void underscoredNames() {
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Port_of_Spain")).toString());
		assert(control.getLocalTime("America/Port_of_Spain").equals(ZonedDateTime.now(ZoneId.of("America/Port_of_Spain")).toString()));
	}
	
	@Test
	public void testDoubleForwardSlashName() {
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Kentucky/Monticello")).toString());
		assert(control.getLocalTime("America/Kentucky/Monticello").equals(ZonedDateTime.now(ZoneId.of("America/Kentucky/Monticello")).toString()));
	}
	
	@Test
	public void testPlusInName() {
		System.out.println(ZonedDateTime.now(ZoneId.of("Etc/GMT+6")).toString());
		assert(control.getLocalTime("Etc/GMT+6").equals(ZonedDateTime.now(ZoneId.of("Etc/GMT+6")).toString()));
	}
}
