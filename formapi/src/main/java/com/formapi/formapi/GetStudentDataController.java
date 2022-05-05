package com.formapi.formapi;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class GetStudentDataController {

	private static final String template ="Hello %s";
	private AtomicLong counter = new AtomicLong();
	
	//@GetMapping("/getDetails")
    public GetStudentDetails getDetails(@RequestParam(value ="name", defaultValue="varshaa")String name) {
             return new GetStudentDetails(counter.incrementAndGet(),String.format(template,name));		
	}
	
}
