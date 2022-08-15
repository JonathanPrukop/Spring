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
		return "Welcome Home!\nGo to localhost:8080/UTC to see the current UTC.\nSend a valid java timezone id via get request to localhost:8080/UserTime to recieve your current time";
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