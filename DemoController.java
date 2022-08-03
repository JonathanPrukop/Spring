package com.example.demo.controller;

import java.time.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping
	public String displayHomePage()
	{
		return "Welcome Home!";
	}
	
	@RequestMapping("/UTC")
	public String displayUTC()
	{
		return Instant.now().toString();
	}
	
	@RequestMapping("/UserTime")
	public String getLocalTime(@RequestBody String userTime)
	{
        return ZonedDateTime.now(ZoneId.of(userTime)).toString();
	}
}