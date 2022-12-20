package com.example.testrel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greet")
public class GreetController {
  @GetMapping("/me")
  public String getGreeting() {
	  return "Hello World";
  }
}
