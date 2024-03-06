package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class CallController {
	@GetMapping("/call")
public String call() {
	System.out.println("call recieved by the back-end");
	return "call recieved";
}
	@PostMapping("/testpost")
	public String testPost(@RequestBody String data) {
		System.out.println("Post request recieved"+data);
		return "Success";
	}
	@PostMapping("/testform")
	public String testform(@RequestBody String formdata) {
		System.out.println("Post request recieved"+formdata);
		return "Success";
	}
}
