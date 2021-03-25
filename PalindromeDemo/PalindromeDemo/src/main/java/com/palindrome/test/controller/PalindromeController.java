package com.palindrome.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palindrome.test.bean.Bean;
import com.palindrome.test.serviceimpl.PalindromeServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Validated
@Api(tags = "Palindrome APIs")
@RestController
@RequestMapping(value = "/palindrome")
public class PalindromeController {
	
	@Autowired
	private PalindromeServiceImpl palindromeService;
	 
	@PostMapping
	@ApiOperation(value = "Extract and Store Palindrome ", notes = "Extract and Store Palindrome ")
	 public ResponseEntity<Bean> storePalindrome(@RequestBody String data) {
		Bean response = palindromeService.storePalindrome(data);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping(value="/{id}")
	@ApiOperation(value = "Get Palindrome by id", notes = "Get Palindrome by id")
	 public ResponseEntity<Bean> getPalindromeById(@PathVariable String id) {
		Bean response = palindromeService.getPalindromeById(id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping
	@ApiOperation(value = "Get all Palindromes", notes = "Get all Palindromes")
	 public ResponseEntity<List<Bean>> getPalindromes() {
		List<Bean> response = palindromeService.getAll();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
